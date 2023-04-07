package com.knimbus.test;

import com.knimbus.driver.Driver;
import com.knimbus.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BaseTest {


    @BeforeSuite
    public void beforeSuite() {
        ExtentReport.initReports();

    }

    @AfterSuite
    public void afterSuite() {
        ExtentReport.flushReports();
    }

    @BeforeMethod
    public void setUp(Method method) {
        ExtentReport.createTest(method.getName());
        Driver.intDriver();

    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }

}
