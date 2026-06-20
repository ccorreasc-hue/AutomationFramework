package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    //Localizadores
    private By checkoutButton = By.id("checkout");

    //Constructor
    public CartPage(WebDriver driver){
        super(driver);
    }

    //Ir a Checkout
    public CheckOutPage clickCheckout(){
        click(checkoutButton);
        return new CheckOutPage(driver);
    }
}
