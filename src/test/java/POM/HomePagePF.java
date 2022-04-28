package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {
    WebDriver driver;

    public HomePagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//input[@id='srchquery_tbox']")
    WebElement searchKey;

    @FindBy(xpath = "//form[@name='newsrchform']//input[@type='submit']")
    WebElement submitSearch;

    public WebElement Searchkey(){
        return searchKey;
    }
    public WebElement SubmitSearch(){
        return submitSearch;
    }
}
