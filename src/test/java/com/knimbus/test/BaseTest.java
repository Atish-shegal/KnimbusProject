package com.knimbus.test;

import com.knimbus.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Driver.intDriver();

    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}
