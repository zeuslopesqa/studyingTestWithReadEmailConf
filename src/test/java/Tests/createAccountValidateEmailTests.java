package Tests;

import Pages.CreateAccountPage;
import Pages.HomePage;
import Pages.SignInPage;
import Utils.WebNavigator;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class createAccountValidateEmailTests {
    WebDriver navigator;

    @Before
    public void setUp(){
       navigator = WebNavigator.createChrome();
    }

    @Test
    public void createAccount(){
        new HomePage(navigator)
                .clickIconAndSignIn();
        new SignInPage(navigator)
                .clickCreateAccount();
        new CreateAccountPage(navigator)
                .inputFields();


    }
}
