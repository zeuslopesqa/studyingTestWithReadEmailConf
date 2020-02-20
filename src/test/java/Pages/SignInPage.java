package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver navigator) {
        super(navigator);
    }

    public CreateAccountPage clickCreateAccount(){
        navigator.findElement(By.cssSelector("#sign-in-form > button.button.ghost.text-capitalize")).click();
        return new CreateAccountPage(navigator);
    }
}
