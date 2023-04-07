package com.knimbus.pages.pagecomponent;

import com.knimbus.utilis.SeleniumUtils;
import org.openqa.selenium.By;

public class TopMenuComponent {
    private final By LINK_ADMIN = By.xpath("//a[@href=\"/web/index.php/admin/viewAdminModule\"]");

    public void clickOnAdminLink(){
        SeleniumUtils.click(LINK_ADMIN,"Admin Link");
    }

}
