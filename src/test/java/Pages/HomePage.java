package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver navigator) {
        super(navigator);
    }

    public HomePage clickIconAccount(){
        navigator.findElement(By.cssSelector("#header-account-toggle > span > span > span.e_a.z_c.z_f.e_g.e_b.e_p.w_a.w_h.w_j")).click();

        return HomePage.this;
    }
    public SignInPage clickSignIn(){
        navigator.findElement(By.cssSelector("#signed-out > a:nth-child(1) > div > span > div")).click();

        return new SignInPage(navigator);
    }

    public SignInPage clickIconAndSignIn(){
            clickIconAccount().clickSignIn();
        return new SignInPage(navigator);
    }
}
