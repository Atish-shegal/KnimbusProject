package com.knimbus.test;

import com.knimbus.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {


    @BeforeMethod
    public void setUp(Method method) {
        Driver.intDriver();

    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }

}
