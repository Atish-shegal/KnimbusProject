package com.knimbus.driver;

import com.knimbus.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    public static void intDriver() {
        String browser = ConfigFactory.getConfig().browser();
        if (DriverManager.getDriver() == null) {
            System.out.println("1st " + DriverManager.getDriver());
            WebDriver driver = DriverFactory.getDriver(browser);
            DriverManager.setDriver(driver);
            System.out.println("2nd " + DriverManager.getDriver());
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeouts()));
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }

    }

    public static void quitDriver() {
        if  (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }

}
