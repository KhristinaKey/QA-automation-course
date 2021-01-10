package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Footer;
import com.atqa2020Kris.framework.Header;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GiftCardsPage extends Page{
    public Header header;
    private String giftCardsPageLocator = "//a[contains(text(),'Gift Cards')]";

    public GiftCardsPage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        }
}
