package pages;

import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;

import static utils.Wait.wait;

public class RegisterNewUserPage extends BasePage {
    @FindBy(id="input-firstname")
    private static WebElement inputFieldFirstName;

    @FindBy(id = "input-lastname")
    private static WebElement inputFieldLastName;

    @FindBy(id = "input-email")
    private static WebElement inputFieldEmail;

    @FindBy(id = "input-telephone")
    private static WebElement inputFieldTelephoneNumber;

    @FindBy(id = "input-password")
    private static WebElement inputFieldPassword;

    @FindBy(id = "input-confirm")
    private static WebElement inputFieldConfirmPassword;

    @FindBy(css = "input[type='checkbox']")
    private static WebElement checkBoxAgreement;

    @FindBy(css = ".btn-primary")
    private static WebElement continueBtn;

    public static String username = nameGenerator();
    public static String email = emailGenerator();
    public static String phoneNumber = phoneNumberGenerator();


    static {
        PageFactory.initElements(Browser.driver, RegisterNewUserPage.class);
    }

    public static WebElement getInputFieldFirstName(){
        return inputFieldFirstName;
    }

    public static WebElement getInputFieldLastName(){
        return inputFieldLastName;
    }
    public static WebElement getInputFieldEmail(){
        return inputFieldEmail;
    }
    public static WebElement getInputFieldTelephoneNumber(){
        return inputFieldTelephoneNumber;
    }
    public static WebElement getInputFieldPassword(){
        return inputFieldPassword;
    }

    public static WebElement getInputFieldConfirmPassword(){
        return inputFieldConfirmPassword;
    }

    public static WebElement getCheckBoxAgreement(){
        return checkBoxAgreement;
    }

    public static WebElement getContinueBtn(){
        return continueBtn;
    }


    public static void fillTheInputFields(String userName, String emailAddress, String phoneNumber, String password){
        inputFieldFirstName.sendKeys(userName);
        inputFieldLastName.sendKeys(userName);
        inputFieldEmail.sendKeys(emailAddress);
        inputFieldTelephoneNumber.sendKeys(phoneNumber);
        inputFieldPassword.sendKeys(password);
        inputFieldConfirmPassword.sendKeys(password);
    }

    public static void clickCheckBoxAgreement(){
        Assert.assertFalse(checkBoxAgreement.isSelected());
        checkBoxAgreement.click();
    }
    public static void clickContinueButton(){
        continueBtn.click();
    }



    public static String emailGenerator(){
        String prefix = RandomStringUtils.randomAlphabetic(7);
        String domainPrefix = RandomStringUtils.randomAlphabetic(5);
        String mainDomain = RandomStringUtils.randomAlphabetic(3);
        String emailAddress = prefix + "@" + domainPrefix + "." + mainDomain;
        return emailAddress;
    }

    public static String nameGenerator(){
        String userName = RandomStringUtils.randomAlphabetic(7);
        return userName;
    }

    public static String phoneNumberGenerator(){
        String phoneNumber = RandomStringUtils.randomNumeric(6);
        return phoneNumber;
    }
}
