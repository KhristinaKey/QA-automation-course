package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Footer;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HelpPage extends Page{

    //TODO Footer is never used here and private variable shouldn't be declared static in this case
    public Footer footer;
    private String helpPageTitleLocator = "//a[contains(text(),'Help')]";
    private static String HELP_PAGE_TITLE = "Hello. What can we help you with?";

    public HelpPage(RemoteWebDriver driver) {
        super(driver);
        this.footer = new Footer(driver);
    }
    
    public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(helpPageTitleLocator)).getText().equals(HELP_PAGE_TITLE);
    }
}
