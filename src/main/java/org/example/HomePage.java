package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    //Localizadores
    private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private By shoppingCartButton = By.className("shopping_cart_link");
    private By dropDownProduct = By.xpath("//select[@data-test='product-sort-container']");

    //Constructor
    public HomePage(WebDriver driver){
        super(driver);
    }

    public void addProductToCart(){
        click(addToCartButton);

    }

    public void selectProduct(String option) {
        selectByVisibleText(dropDownProduct, option);
    }

    public CartPage goToCart(){
        click(shoppingCartButton);
        return new CartPage(driver);

    }
}
