package pages;


import copmpoments.HeaderComponent;
import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;

import static utils.Browser.driver;
import static utils.Wait.wait;


public class HomePage extends BasePage {

    private static String homePageUrl = "http://shop.pragmatic.bg/";


    static {
        PageFactory.initElements(driver, HomePage.class);
    }

    public static void goTo() {
        Browser.driver.get(homePageUrl);
    }

    public static void goToRegisterUser(){
        HeaderComponent.getMyAccountElement().click();
        Assert.assertTrue(HeaderComponent.getRegisterUser().isDisplayed());
        HeaderComponent.getRegisterUser().click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

}

