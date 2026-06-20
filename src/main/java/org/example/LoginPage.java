package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Localizadores
    private By txtUsername = By.id("user-name");
    private By txtPassword = By.id("password");
    private By btnLogin = By.id("login-button");

    //Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void enterUsername(String username){
        type(txtUsername,username);
    }

    public void enterPassword(String password){
        type(txtPassword,password);
    }

    public void clickLogin(){
        click(btnLogin);
    }

    public HomePage login(String username,String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        return new HomePage(driver);
    }
}
