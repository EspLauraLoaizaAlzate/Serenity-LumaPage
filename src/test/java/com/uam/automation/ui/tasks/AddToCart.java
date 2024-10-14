package com.uam.automation.ui.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.uam.automation.ui.userinterface.AddToCartPage.*;
import static com.uam.automation.ui.userinterface.CheckOutProcessPage.*;
import static com.uam.automation.ui.userinterface.SignInPage.EMAIL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddToCart implements Task {


    @Override
    @Step("{0} Add to cart")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("tee").into(SEARCH).thenHit(Keys.ENTER),
                WaitUntil.the(PRODUCT, isVisible()).forNoMoreThan(10).seconds(),
                MoveMouse.to(PRODUCT),
                Click.on(ADD_TO_CART_BUTTON),
                WaitUntil.the(SELECT_SIZE, isVisible()).forNoMoreThan(10).seconds(),

                Task.where("{0} waits for 2 seconds", _actor -> {
                    try {
                        Thread.sleep(2000); // 2000 milisegundos = 2 segundos
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }),
                Click.on(SELECT_SIZE),
                Click.on(SELECT_COLOR),
                Enter.theValue("2").into(QUANTITY_PRODUCTS),
                Click.on(ADDTOCART_BUTTON)

        );

    }

    public static AddToCart with() {
        return Instrumented.instanceOf(AddToCart.class).withProperties();
    }
}
