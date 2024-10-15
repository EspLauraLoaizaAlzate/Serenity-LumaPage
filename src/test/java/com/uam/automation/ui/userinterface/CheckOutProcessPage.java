package com.uam.automation.ui.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class CheckOutProcessPage extends PageObject{
    public static Target SELECT_CART = Target.the("select cart").locatedBy("//a[@class='action showcart']");
    public static Target CHECKOUT_BUTTON = Target.the("checkout button").located(By.id("top-cart-btn-checkout"));
    public static Target SHIPPING_METHODS = Target.the("Shipping methods").locatedBy("//input[@type='radio' and @name='ko_unique_2']");
    public static Target NEXT_BUTTON = Target.the("Next button").locatedBy("//button[@type='submit' and @data-role='opc-continue']");
    public static Target PLACEORDER_BUTTON = Target.the("Place order button").locatedBy("//button[@type='submit' and @class='action primary checkout']");
    public static Target FINISH_MESSAGE = Target.the("Finish message").locatedBy("//span[contains(text(), 'Thank you for your purchase!')]");

}
