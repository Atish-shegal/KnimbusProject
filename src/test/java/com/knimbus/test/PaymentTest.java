package com.knimbus.test;

import com.knimbus.driver.Driver;
import com.knimbus.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{

    @Test
    public void test() {
        DriverManager.getDriver().findElement(By.name("username")).sendKeys("Admin");
        DriverManager.getDriver().findElement(By.name("password")).sendKeys("admin123");
        DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");


    }
}
