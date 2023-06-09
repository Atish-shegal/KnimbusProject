package com.knimbus.test;

import com.knimbus.annotations.FrameworkAnnotation;
import com.knimbus.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"Admin", "admin123", "OrangeHRMM"}
        };
    }

    @FrameworkAnnotation(author = "Atish Shegal")
    @Test(description = "Login class test",dataProvider = "getData")
    public void titleValidationTest(String username, String password, String expectedTitle) {
        LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage.doLoginWithValidCredentials(username, password).getHomePageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
