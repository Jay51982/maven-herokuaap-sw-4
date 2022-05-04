package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.pages.VerifyUser;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyThePasswordErrorMessage extends TestBase {

    LoginPage loginPage = new LoginPage();
    VerifyUser verifyUser = new VerifyUser();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();

        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = verifyUser.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Login Secure area message not displayed");
    }
}
