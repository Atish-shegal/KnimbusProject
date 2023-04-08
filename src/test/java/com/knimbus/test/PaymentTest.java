package com.knimbus.test;

import com.knimbus.annotations.FrameworkAnnotation;
import com.knimbus.driver.DriverManager;
import com.knimbus.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {
    @FrameworkAnnotation(author = "QA TEAM")
    @Test(description = "Sample Test")
    public void test() {
        LoginPage loginPage = new LoginPage();
        loginPage.doLoginWithValidCredentials("admin", "admin123");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM");

    }
}
