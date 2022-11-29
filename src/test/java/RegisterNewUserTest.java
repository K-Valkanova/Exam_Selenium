import core.BasePage;
import core.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterNewUserPage;
import pages.SuccessfulRegistrationPage;

public class RegisterNewUserTest extends BaseTest {
    @Test
    public void testRegisterUser(){
        HomePage.goTo();
        HomePage.goToRegisterUser();
        RegisterNewUserPage.fillTheInputFields(RegisterNewUserPage.username,RegisterNewUserPage.email, RegisterNewUserPage.phoneNumber, "Parola!1234");
        RegisterNewUserPage.clickCheckBoxAgreement();
        RegisterNewUserPage.clickContinueButton();
        SuccessfulRegistrationPage.assertRegistrationIsSuccessful();
    }

}
