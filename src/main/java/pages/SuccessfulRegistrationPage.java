package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;

import static utils.Wait.wait;

public class SuccessfulRegistrationPage extends BasePage {
    @FindBy(css = "div[id='content']")
    private static WebElement pageContent;

    @FindBy(css = "h1")
    private static WebElement pageSuccessHeader;

    static {
        PageFactory.initElements(Browser.driver, SuccessfulRegistrationPage.class);
    }
    public static WebElement getPageContent(){
        return pageContent;
    }
    public static WebElement getPageSuccessHeader(){
        return pageSuccessHeader;
    }

    public static void assertRegistrationIsSuccessful(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id='content']")));
        String successMessage = pageSuccessHeader.getText();
        Assert.assertEquals(successMessage, "Your Account Has Been Created!");
    }
}

