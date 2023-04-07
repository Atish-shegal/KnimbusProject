package com.knimbus.pages.pagecomponent;

import com.knimbus.driver.DriverManager;
import org.bouncycastle.crypto.DerivationFunction;
import org.openqa.selenium.By;

public class TopMenuComponent {
    private final By LINK_ADMIN = By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]");

    public void clickOnAdminLink(){
        DriverManager.getDriver().findElement(LINK_ADMIN).click();
    }

}
