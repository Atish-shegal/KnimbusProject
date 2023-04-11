package com.knimbus.listeners;

import com.knimbus.annotations.FrameworkAnnotation;
import com.knimbus.reports.ExtentLogger;
import com.knimbus.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListeners implements ITestListener {

    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getDescription());
        ExtentReport.assignAuthor(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class).author());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() + " is passed");
    }


    public void onTestFailure(ITestResult result) {
        ExtentLogger.info(result.getName() + " is failed");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.info(Arrays.toString(result.getThrowable().getStackTrace()));

    }
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.info(result.getName() + " is skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }


    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }


    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }
}
