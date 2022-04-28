package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//input[@id='login1']");
    By password = By.xpath("//input[@id='password']");
    By signIn = By.xpath("//input[@title='Sign in']");
    By home = By.linkText("rediff.com");

    public WebElement Username(){
        return driver.findElement(username);
    }

    public WebElement Password(){
        return driver.findElement(password);
    }

    public WebElement Signin(){
        return driver.findElement(signIn);
    }
    public WebElement Homepage(){
        return driver.findElement(home);
    }
}
