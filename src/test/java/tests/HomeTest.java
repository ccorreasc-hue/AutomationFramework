package tests;

import com.github.javafaker.Faker;
import org.example.*;

import org.openqa.selenium.WebDriver;
import driver.DriverManager;

import org.testng.annotations.*;

public class HomeTest {
    protected WebDriver driver;
    private HomePage homePage;
    private CheckOutPage checkOut;

    @BeforeMethod
    public void setUp(){
        driver = DriverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void checkoutTest() {
        Faker faker = new Faker();
        String nombre = String.valueOf(faker.name()); //Nombre aleatorio

        LoginPage loginPage = new LoginPage(driver);
        homePage = loginPage.login("performance_glitch_user","secret_sauce");

        homePage.addProductToCart();

        CartPage cart = homePage.goToCart();

        checkOut = cart.clickCheckout();
        checkOut.fillForm(nombre,"Corr","28008"); //Nombre aleatorio (faker)

        checkOut.clickContinue();
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.quitDriver();
    }


}
