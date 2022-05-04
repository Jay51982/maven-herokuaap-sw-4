package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();

        String expectedErrorMessage = "Secure Area";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Login Secure area message not displayed");
    }


}
