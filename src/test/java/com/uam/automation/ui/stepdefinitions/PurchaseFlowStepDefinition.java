package com.uam.automation.ui.stepdefinitions;

import com.uam.automation.ui.questions.GetText;
import com.uam.automation.ui.tasks.AddToCart;
import com.uam.automation.ui.tasks.CheckOutProcess;
import com.uam.automation.ui.tasks.SignIn;
import com.uam.automation.ui.userinterface.CheckOutProcessPage;
import com.uam.automation.ui.userinterface.CheckOutProcessPage.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;

import static com.uam.automation.ui.userinterface.CheckOutProcessPage.FINISH_MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class PurchaseFlowStepDefinition {

    @Given("{actor} is signs in on Luma Page")
    public void laura_is_signs_in_on_luma_page(Actor actor) {
        actor.wasAbleTo(
                SignIn.with()
        );

    }
    @When("{actor} adds a product to cart")
    public void she_adds_a_product_to_cart(Actor actor) {
        actor.attemptsTo(
                AddToCart.with(),
                CheckOutProcess.with()
        );

    }
    @Then("{actor} finishes the purchase flow")
    public void shouldSeeCheckOutProcess(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(CheckOutProcessPage.FINISH_MESSAGE, isVisible()).forNoMoreThan(30).seconds() // Esperar el mensaje
        );

// Asegúrate de que el texto coincida con el esperado

        String actualText = GetText.fromTarget(CheckOutProcessPage.FINISH_MESSAGE).answeredBy(actor);
        actor.should(
                seeThat("The finish message",
                        GetText.fromTarget(FINISH_MESSAGE), containsString("Checkout"))
        );

    }
}
