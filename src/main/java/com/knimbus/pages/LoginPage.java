package com.knimbus.pages;

import com.knimbus.utilis.SeleniumUtils;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TEXT_BOX_USER_NAME = By.name("username");
    private static final By TEXT_BOX_PASSWORD = By.name("password");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");

    public LoginPage setUserName(String username) {
        SeleniumUtils.sendKeys(TEXT_BOX_USER_NAME, username);
        return this;
    }

    public LoginPage setPassword(String password) {
        SeleniumUtils.sendKeys(TEXT_BOX_PASSWORD, password);
        return this;
    }

    public HomePage clickLogin() {
        SeleniumUtils.click(LOGIN_BTN);
        return new HomePage();
    }


    public HomePage doLogin(String username, String password) {
        return setUserName(username).setPassword(password).clickLogin();

    }

}
