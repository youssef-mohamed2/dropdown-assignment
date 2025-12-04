package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {
    WebDriver driver;


    By addbuttonLocator = By.xpath("//button[@onclick='addElement()']");
    By deleteButtons =By.xpath("//button[@onclick='deleteElement()']");
    public AddRemovePage(WebDriver driver){
        this.driver=driver;
    }
    public void clickonaddElement(){
        driver.findElement(addbuttonLocator).click();
    }
    public void deleteElement() {
        List<WebElement> buttons = driver.findElements(deleteButtons);
        if (!buttons.isEmpty()) {
            buttons.get(0).click();
        }
    }
    public int countElements() {
        return driver.findElements(deleteButtons).size();
    }
    
}
