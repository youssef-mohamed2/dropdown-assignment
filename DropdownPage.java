package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    By dropdownLocator= By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickonOption1(){
        Select select=new Select(driver.findElement(dropdownLocator));
        select.selectByVisibleText("Option 1");
    }
    // 1- Select by Value
    public void cliclonOption2(){
        Select select=new Select(driver.findElement(dropdownLocator));
        select.selectByVisibleText("Option 2");
    }

    public void selectByValue(String value){
        Select select=new Select(driver.findElement(dropdownLocator));
        select.selectByValue(value);
    }

    //  Select by Index
    public void selectByIndex(int index){
        Select select=new Select(driver.findElement(dropdownLocator));
        select.selectByIndex(index);
    }

    // 3- Get selected option text
    public String getSelectedOption(){
        Select select=new Select(driver.findElement(dropdownLocator));
        return select.getFirstSelectedOption().getText();
    }
}
