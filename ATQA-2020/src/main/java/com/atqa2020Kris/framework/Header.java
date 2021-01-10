package com.atqa2020Kris.framework;

import com.atqa2020Kris.Pages.CartPage;
import com.atqa2020Kris.Pages.DealsAndPromotionsPage;
import com.atqa2020Kris.Pages.GiftCardsPage;
import com.atqa2020Kris.Pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header {
    protected RemoteWebDriver driver;
    private String cartPageTitleLocator = "//span[@id='nav-cart-count']";
    private String todayDealsLocator = "//div[@id='nav-xshop']//a[@href='/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl']";
    private String giftCardsPageTitleLocator = "//a[contains(text(),'Gift Cards')]";

    public Header(final RemoteWebDriver driver) {
        this.driver = driver;
    }
    public Header setDealsAndPromotions(String dealsAndPromotions) {
        driver.findElement(By.xpath(todayDealsLocator)).click();
        return this;
    }
    public <T extends Page> T clickOnButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(todayDealsLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
    public CartPage navigateToCartPage() throws Exception {
        driver.findElement(By.xpath(cartPageTitleLocator)).click();
        return PageFactory.newPage(driver, CartPage.class);
    }
    public GiftCardsPage navigateToGiftCardsPage() throws Exception {
        driver.findElement(By.xpath(giftCardsPageTitleLocator)).click();
        return PageFactory.newPage(driver, GiftCardsPage.class);
    }
    public DealsAndPromotionsPage navigateToDealsAndPromotionsPage() throws Exception {
        driver.findElement(By.xpath(todayDealsLocator)).click();
        return PageFactory.newPage(driver, DealsAndPromotionsPage.class);
    }
}

