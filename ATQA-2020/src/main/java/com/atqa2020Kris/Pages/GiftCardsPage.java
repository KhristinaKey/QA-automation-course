package com.atqa2020Kris.Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class GiftCardsPage extends Page{
    private final String giftCardsPageLocator = "//a[contains(text(),'Gift Cards')]";

    public GiftCardsPage(RemoteWebDriver driver) {

        super(driver);
    }
}
