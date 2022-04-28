package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchKey = By.xpath("//input[@id='srchquery_tbox']");
    By submitSearch = By.cssSelector(("form[name='newsrchform'] input[type='submit']"));

    public WebElement Searchkey(){
        return driver.findElement(searchKey);
    }
    public WebElement SubmitSearch(){
        return driver.findElement(submitSearch);
    }
}
