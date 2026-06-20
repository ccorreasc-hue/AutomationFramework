package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {

    //Localizadores
    private By txtFirstName = By.id("first-name");
    private By txtLastName = By.id("last-name");
    private By txtPostalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");

    //Constructor
    public CheckOutPage(WebDriver driver){
        super(driver);
    }

    public void EnterFirstName(String name){
        type(txtFirstName, name);
    }

    public void EnterLastName(String name){
        type(txtLastName, name);
    }

    public void EnterPostalCode(String postalCode){
        type(txtPostalCode,postalCode);
    }

    public void fillForm(String f, String l, String z){
        type(txtFirstName,f);
        type(txtLastName,l);
        type(txtPostalCode,z);
    }

    public void clickContinue(){
        click(continueBtn);
    }

}
