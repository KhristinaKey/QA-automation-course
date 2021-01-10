package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Footer;
import okhttp3.internal.http2.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page{

    private Header header;
    private Footer footer;

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.footer = new Footer(driver);
    }

    public BlogPage navigateToBlogPage () throws Exception {
       return footer.navigateToBlogPage();
    }

    public <T extends Page> T clickOnButton(Class<T> clazz, String dealsAndPromotions) {
       return header.setDealsAndPromotions(dealsAndPromotions).clickOnDealsButton(clazz);
    }

    public GiftCardsPage navigateToGiftCardsPage() throws Exception {
        return header.navigateToGiftCardsPage();
    }

    public CartPage navigateToCartPage() throws Exception {
        return header.navigateToCartPage();
    }

    public DealsAndPromotionsPage navigateToDealsAndPromotionsPage() throws Exception {
        return header.navigateToDealsAndPromotionsPage();
    }

    public HelpPage navigateToHelpPage() throws Exception {
        return footer.navigateToHelpPage();
    }
}
