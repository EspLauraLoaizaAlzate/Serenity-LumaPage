package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class SignInPage extends PageObject{
    public static Target SIGN_IN = Target.the("sign in").locatedBy("(//a[contains(text(),'Sign')])[1]");
    public static Target EMAIL = Target.the("email").located(By.id("email"));
    public static Target PASSWORD = Target.the("password").located(By.id("pass"));
    public static Target SIGNIN_BUTTON = Target.the("sign in").located(By.id("send2"));
    public static Target WELCOME = Target.the("WELCOME").locatedBy("(//span[contains(text(),'Welcome, Laura Loaiza!')])[1]");
}

