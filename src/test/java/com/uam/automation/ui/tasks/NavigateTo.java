package com.uam.automation.ui.tasks;

import com.uam.automation.ui.userinterface.SignInPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSignInPage(){
        return Task.where("{0} opens the sign in page",
                Open.browserOn().the(SignInPage.class));
    }

}
