package com.uam.automation.ui.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.annotations.Step;
import static com.uam.automation.ui.userinterface.SignInPage.*;

public class SignIn implements Task {
    @Override
    @Step("{0} sign in page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavigateTo.theSignInPage(),
                Click.on(SIGN_IN),
                Enter.theValue("laura.loaizaa@autonoma.edu.co").into(EMAIL),
                Enter.theValue("12Laura34").into(PASSWORD),

                Click.on(SIGNIN_BUTTON)
        );

    }

    public static SignIn with() {
        return Instrumented.instanceOf(SignIn.class).withProperties();

        //return new SignIn();
    }

}
