package com.knimbus.pages;

import com.knimbus.driver.DriverManager;
import com.knimbus.pages.pagecomponent.TopMenuComponent;

public class HomePage {
    private TopMenuComponent topMenuComponent;

    public HomePage(){
        topMenuComponent = new TopMenuComponent();
    }


    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnAdmin(){
        topMenuComponent.clickOnAdminLink();
    }
}