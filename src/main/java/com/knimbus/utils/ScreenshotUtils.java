package com.knimbus.utils;

import com.knimbus.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ScreenshotUtils {
    private ScreenshotUtils(){}

    public static String getScreenshot(){
        //System.out.println(DriverManager.getDriver());
      return  ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
