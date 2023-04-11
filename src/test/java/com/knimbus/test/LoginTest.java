package com.knimbus.test;

import com.knimbus.annotations.FrameworkAnnotation;
import com.knimbus.pages.LoginPage;
import com.knimbus.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.stream.Stream;


public class LoginTest extends BaseTest {

  /*  @DataProvider
    public static Object[][] getData() {
        return new Object[][]{
                {"Admin", "admin123", "OrangeHRM"}
        };
    }*/

 /*   @DataSupplier
    public Stream<TestData> getData(Method method){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testData.xlsx")
                .read()
                .filter(testData -> testData.testCaseName.equalsIgnoreCase(method.getName()));
    }*/

    //USING NORMAL
   /* @FrameworkAnnotation(author = "Atish Shegal")
    @Test(description = "Login class test",dataProvider = "getData")
    public void titleValidationTest(String username, String password, String expectedTitle) {
        LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage.doLoginWithValidCredentials(username, password).getHomePageTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");
    }*/

    // Using ZEROCELL DATA
    @FrameworkAnnotation(author = "QA TEAM")
    @Test(description = "Sample Test")
    public void titleValidationTest(TestData testData) {
        /*LoginPage loginPage = new LoginPage();
        String actualTitle = loginPage.doLoginWithValidCredentials(testData.userName, testData.password).getHomePageTitle();
        Assert.assertEquals(actualTitle, "OrangeHRM");*/


    }

}
