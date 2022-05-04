package login.com.herokuapp.internet_the.pages;


import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class VerifyUser extends Utility {

    By errorMessage = By.xpath("//div[@id='flash']");

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }



}
