package com.knimbus.pages;

import com.knimbus.driver.DriverManager;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TEXT_BOX_USER_NAME = By.name("username");
    private static final By TEXT_BOX_PASSWORD = By.name("password");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");

    public LoginPage setUserName(String username) {
        DriverManager.getDriver().findElement(TEXT_BOX_USER_NAME).sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        DriverManager.getDriver().findElement(TEXT_BOX_PASSWORD).sendKeys(password);
        return this;
    }

    public HomePage clickLogin() {
        DriverManager.getDriver().findElement(LOGIN_BTN).click();
        return new HomePage();
    }


    public HomePage doLogin(String username, String password) {
        setUserName(username);
        setPassword(password);
        clickLogin();
        return new HomePage();

    }

}
