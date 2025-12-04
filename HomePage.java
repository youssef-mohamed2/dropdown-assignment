package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;


    By formLinklocator = By.linkText("Form Authentication");
    By checkboxLocator = By.linkText("Checkboxes");
    By dropdownLocator =By.linkText("Dropdown");
    By addRemoveLocator = By.linkText("Add/Remove Elements");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }


public FormAuthPage clickFormLink() {
    driver.findElement(formLinklocator).click();
return new FormAuthPage(driver);
}

    public checkboxpage clickCheckboxLink()
    {
        driver.findElement(checkboxLocator).click();
        return new checkboxpage(driver);
    }
    public DropdownPage clickDropdownLink(){
        driver.findElement(dropdownLocator).click();
        return new DropdownPage(driver);
    }
    public AddRemovePage clickAddRemoveLink(){
        driver.findElement(addRemoveLocator).click();
        return new AddRemovePage(driver);
    }

}
