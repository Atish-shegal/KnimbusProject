package com.knimbus.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public final class DriverFactory {
    private DriverFactory(){}
        public static WebDriver getDriver(String browserName) {
        WebDriver driver;

        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else
        {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
return driver;
    }
}