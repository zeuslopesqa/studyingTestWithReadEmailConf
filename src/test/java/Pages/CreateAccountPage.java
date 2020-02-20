package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver navigator) {
        super(navigator);
    }

    public CreateAccountPage inputFields(){
        Faker fk = new Faker();

        navigator.findElement(By.cssSelector("#first-name-su")).sendKeys(fk.firstName());
        navigator.findElement(By.cssSelector("#last-name-su")).sendKeys(fk.lastName());
        navigator.findElement(By.cssSelector("#email-su")).sendKeys();
        navigator.findElement(By.cssSelector("#password-su")).sendKeys("123456");
        navigator.findElement(By.cssSelector("#sign-up-form > div.option.m-margin-top.copy-mini > label")).click();

        return CreateAccountPage.this;
    }
}
