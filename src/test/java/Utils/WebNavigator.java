package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebNavigator {
    static WebDriver navigator;

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zeus\\Documents\\Drivers navegadores\\chromedriver.exe");
        navigator = new ChromeDriver();
        navigator.manage().window().maximize();
        navigator.get("https://www.walmart.com/");

        return navigator;
    }
}
