package Testcases;

import POM.HomePage;
import POM.HomePagePF;
import POM.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LoginTest {


    @Test
    public void loginTest(){

        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        LoginPage loginpage = new LoginPage(driver);
        HomePagePF homePagePF = new HomePagePF(driver);


        loginpage.Username().sendKeys("Shakil");
        loginpage.Password().sendKeys("1234");
        loginpage.Signin().click();
        loginpage.Homepage().click();


        driver.close();
    }

    @Test
    public void searchtest(){
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        HomePagePF homePage = new HomePagePF(driver);
        homePage.Searchkey().sendKeys("Shakil");
        homePage.SubmitSearch().click();

    }
}
