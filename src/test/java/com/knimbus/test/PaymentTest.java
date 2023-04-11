package com.knimbus.test;

import com.knimbus.annotations.FrameworkAnnotation;
import com.knimbus.driver.DriverManager;
import com.knimbus.pages.LoginPage;
import com.knimbus.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.stream.Stream;

public class PaymentTest extends BaseTest {

     @DataSupplier
    public Stream<TestData> getData(Method method){
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testData.xlsx")
                .read()
                .filter(testData -> testData.testCaseName.equalsIgnoreCase(method.getName()));
    }



        @FrameworkAnnotation(author = "Atish Shegal")
        @Test(description = "Login class test",dataProvider = "getData")
        public void test(TestData testData) {
            LoginPage loginPage = new LoginPage();
            String actualTitle = loginPage.doLoginWithValidCredentials(testData.userName, testData.password).getHomePageTitle();
            Assert.assertEquals(actualTitle, "OrangeHRM");
    }
}