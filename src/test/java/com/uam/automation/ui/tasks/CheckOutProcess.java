package com.uam.automation.ui.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.uam.automation.ui.userinterface.CheckOutProcessPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckOutProcess implements Task {
    @Override
    @Step("{0} finishes the purchase flow")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Task.where("{0} waits for 2 seconds", _actor -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }),
                WaitUntil.the(SELECT_CART, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECT_CART),
                Click.on(CHECKOUT_BUTTON),
                WaitUntil.the(SHIPPING_METHODS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SHIPPING_METHODS),
                WaitUntil.the(NEXT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NEXT_BUTTON),
                WaitUntil.the(PLACEORDER_BUTTON, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PLACEORDER_BUTTON)
                //WaitUntil.the(FINISH_MESSAGE, isVisible()).forNoMoreThan(20).seconds()

        );

    }

    public static CheckOutProcess with() {
        return Instrumented.instanceOf(CheckOutProcess.class).withProperties();
    }
}
