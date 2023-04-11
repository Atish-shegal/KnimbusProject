package com.knimbus.utils;

import com.knimbus.config.ConfigFactory;
import com.knimbus.driver.DriverManager;
import com.knimbus.enums.WaitType;
import com.knimbus.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public static void click(By by, String elementName) {
        WebElement element = waitUntilElementPresent(by);
        element.click();
        ExtentLogger.pass(elementName +" is clicked");

    }

    public static void click(By by, WaitType waitType) {
        WebElement element = null;

        if (waitType == WaitType.PRESENCE) {
            element = waitUntilElementPresent(by);

        } else if (waitType == WaitType.CLICKABLE) {
            element = waitUntilElementToBeClickable(by);

        }

        element.click();
    }

    public static void sendKeys(By by, String value, String elementName) {
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
        ExtentLogger.pass(value + " is entered successfully in "+elementName);

    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeouts()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeouts()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
