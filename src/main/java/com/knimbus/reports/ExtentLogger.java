package com.knimbus.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.knimbus.utilis.ScreenshotUtils;

public final class ExtentLogger {
    private ExtentLogger(){}
    public static void pass(String message){
        // ExtentManager.getExtentTest().pass(message);
        ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void fail(String message){
        // ExtentManager.getExtentTest().fail(message);
        ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void info(String message){
        // ExtentManager.getExtentTest().info(message);
        ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }
}
