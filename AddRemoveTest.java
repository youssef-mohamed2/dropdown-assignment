package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveTest extends BaseTestClass {
    @Test
    public void verifyaddElements(){
        addRemovePage=homePage.clickAddRemoveLink();
        addRemovePage.clickonaddElement();
        addRemovePage.clickonaddElement();
        addRemovePage.clickonaddElement();
        addRemovePage.clickonaddElement();
        addRemovePage.clickonaddElement();
        addRemovePage.deleteElement();
        addRemovePage.deleteElement();
        addRemovePage.deleteElement();
        Assert.assertEquals(addRemovePage.countElements(), 2);

        System.out.println(addRemovePage.countElements());
    }

}
