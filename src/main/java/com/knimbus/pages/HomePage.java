package com.knimbus.pages;

import com.knimbus.driver.DriverManager;
import com.knimbus.pages.pagecomponent.FooterMenuComponent;
import com.knimbus.pages.pagecomponent.TopMenuComponent;

public class HomePage {
    private TopMenuComponent topMenuComponent;
    private FooterMenuComponent footerMenuComponent;

    public HomePage(){
        topMenuComponent = new TopMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    }
    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickOnAdmin(){
        topMenuComponent.clickOnAdminLink();
    }


}