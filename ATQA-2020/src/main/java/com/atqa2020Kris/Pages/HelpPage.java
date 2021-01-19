package com.atqa2020Kris.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
public class HelpPage extends Page{

        private String helpPageLinkLocator = "//a[contains(text(),'Help')]";
        private String HELP_PAGE_TITLE = "Hello. What can we help you with?";
        public HelpPage(RemoteWebDriver driver) {
            super(driver);
        }
        public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(helpPageLinkLocator)).getText().equals(HELP_PAGE_TITLE);
    }
}
