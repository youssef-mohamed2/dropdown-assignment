package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.awt.*;

public class BaseTestClass {
    WebDriver driver;
    protected HomePage homePage;
    protected FormAuthPage formAuthPage;
    protected checkboxpage checkboxpage;
    protected DropdownPage dropdownPage;
    protected AddRemovePage addRemovePage;

    @BeforeClass
    public void setup(){
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void gotohomepage(){
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
