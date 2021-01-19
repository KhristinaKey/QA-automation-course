package com.atqa2020Kris.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GiftCardsPage extends Page {
    private String giftCardsPageLinkLocator = "//a[contains(text(),'Gift Cards')]";
    private String GIFT_PAGE_TITLE = "Gift Cards";
    public GiftCardsPage(RemoteWebDriver driver) {
        super(driver);
    }
    public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(giftCardsPageLinkLocator)).getText().equals(GIFT_PAGE_TITLE);
    }
}
