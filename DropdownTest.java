package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTestClass {
    @Test
    public void verifyDropdownOption1(){
        dropdownPage=homePage.clickDropdownLink();
        dropdownPage.clickonOption1();
    }
    public void verifyDropdownOption2(){
        dropdownPage=homePage.clickDropdownLink();
        dropdownPage.cliclonOption2();
    }
    @Test
    public void testDropdownWithValue(){
        dropdownPage=homePage.clickDropdownLink();

        // Select Option 2 using value
        dropdownPage.selectByValue("2");

        // Assert that Option 2 is selected
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 2");
        System.out.println("Selected option: " + dropdownPage.getSelectedOption());
    }

    // 2- Test with Index
    @Test
    public void testDropdownWithIndex(){
        dropdownPage=homePage.clickDropdownLink();

        // Select Option 1 using index (index 1 = Option 1)
        dropdownPage.selectByIndex(1);

        // Assert that Option 1 is selected
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1");
        System.out.println("Selected option: " + dropdownPage.getSelectedOption());
    }

    // 3- Test both methods
    @Test
    public void testDropdownBothMethods(){
        dropdownPage=homePage.clickDropdownLink();


        dropdownPage.selectByValue("1");
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1");
        System.out.println("After selectByValue: " + dropdownPage.getSelectedOption());


        dropdownPage.selectByIndex(2);
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 2");
        System.out.println("After selectByIndex: " + dropdownPage.getSelectedOption());
    }
}
