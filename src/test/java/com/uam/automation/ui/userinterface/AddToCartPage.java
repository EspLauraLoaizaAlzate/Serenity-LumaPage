package com.uam.automation.ui.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class AddToCartPage extends PageObject {

    public static Target SEARCH = Target.the("search").located(By.id("search"));
    public static final Target PRODUCT = Target.the("product with title Layla Tee")
            .locatedBy("//a[contains(text(),'Layla Tee')]");
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to Cart button")
            .locatedBy("//a[contains(text(),'Layla Tee')]/ancestor::li//button[contains(@title, 'Add to Cart')]");
    public static Target SELECT_SIZE = Target.the("select size").locatedBy("//div[contains(text(), 'XS')]");
    public static Target SELECT_COLOR = Target.the("select color").locatedBy("//div[@aria-label='Blue']");
    public static Target QUANTITY_PRODUCTS = Target.the("quantity products").located(By.id("qty"));
    public static Target ADDTOCART_BUTTON = Target.the("Add to catr product").located(By.id("product-addtocart-button"));

}