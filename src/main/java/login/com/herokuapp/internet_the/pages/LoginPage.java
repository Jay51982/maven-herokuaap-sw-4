package login.com.herokuapp.internet_the.pages;


import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //storing element in variable

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By errorMessage = By.xpath("//h2[normalize-space()='Secure Area']");
    //div[@id='flash']

    // for each element need to create method

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }
    public void enterUserName(String email){

        sendTextToElement(userNameField,email);
    }
    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
