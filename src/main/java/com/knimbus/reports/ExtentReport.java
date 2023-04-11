package com.knimbus.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.knimbus.constants.FrameworkConstants;

public final class ExtentReport {
    private ExtentReport(){}
    public static ExtentReports extent;
    public static ExtentTest extentTest;


    public static void initReports(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getReportPath());
        extent.attachReporter(spark);

    }
    public static void flushReports(){
        extent.flush();
    }

    public static void createTest(String testCaseName){
        extentTest= extent.createTest(testCaseName);
        ExtentManager.setExtentTest(extentTest);
    }
    public static void assignAuthor(String author){
        ExtentManager.getExtentTest().assignAuthor(author);
    }


}
