package com.knimbus.utilis;

import com.knimbus.config.ConfigFactory;
import com.knimbus.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public static void click(By by) {
        WebElement element = waitUntilElementPresent(by);
        element.click();

    }

    public static void click(By by, String waitStrategy) {
        WebElement element = null;
        if (waitStrategy.equalsIgnoreCase("present")) {
            element = waitUntilElementPresent(by);
        } else if (waitStrategy.equalsIgnoreCase("clickable")) {
            element = waitUntilElementToBeClickable(by);

        }

        element.click();
    }

    public static void sendKeys(By by, String value) {
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);

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
