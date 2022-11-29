package copmpoments;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HeaderComponent extends BasePage {

    @FindBy(css = "div[class='btn-group']")
    private static WebElement currencyElement;

    @FindBy(css = ".fa-phone")
    private static WebElement phoneNumberIcon;

    @FindBy(css = "#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md")
    private static WebElement myAccountElement;

    @FindBy(css = ".fa-heart")
    private static WebElement myWishListIcon;

    @FindBy(css = "#top-links > ul > li:nth-child(4) > a > span")
    private static WebElement shoppingCartIcon;

    @FindBy(css = ".fa-share")
    private static WebElement checkOutIcon;

    @FindBy(css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a")
    private static WebElement registerUser;

    public static WebElement getCurrencyElement(){
        return currencyElement;
    }

    public static WebElement getPhoneNumberIcon(){
        return phoneNumberIcon;
    }
    public static WebElement getMyAccountElement(){
        return myAccountElement;
    }
    public static WebElement getMyWishListIcon(){
        return myWishListIcon;
    }
    public static WebElement getShoppingCartIcon(){
        return shoppingCartIcon;
    }

    public static WebElement getCheckOutIcon(){
        return checkOutIcon;
    }

    public static WebElement getRegisterUser(){
        return registerUser;
    }


    static {
        PageFactory.initElements(Browser.driver, HeaderComponent.class);
    }
}
