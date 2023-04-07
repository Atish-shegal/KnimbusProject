package com.knimbus.pages;

import org.openqa.selenium.By;

import static com.knimbus.utilis.SeleniumUtils.click;
import static com.knimbus.utilis.SeleniumUtils.sendKeys;

public class LoginPage {

    private static final By TEXT_BOX_USER_NAME = By.name("username");
    private static final By TEXT_BOX_PASSWORD = By.name("password");
    private static final By LOGIN_BTN = By.xpath("//button[@type='submit']");

    public LoginPage setUserName(String username) {
        sendKeys(TEXT_BOX_USER_NAME, username,"UserName");
        return this;
    }

    public LoginPage setPassword(String password) {
        sendKeys(TEXT_BOX_PASSWORD, password,"Password");
        return this;
    }

    public HomePage clickLogin() {
        click(LOGIN_BTN,"Login Button");

        return new HomePage();
    }


    public HomePage doLoginWithValidCredentials(String username, String password) {
            return setUserName(username).setPassword(password).clickLogin();


    }
    public LoginPage doLoginWithInValidCredentials(String username, String password) {
       setUserName(username).setPassword(password).clickLogin();
        return this;

    }

}
