package com.atqa2020Kris.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DealsAndPromotionsPage extends Page{

    private final String todayDealsLocator = "//div[@id='nav-xshop']//a[@href='/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl']";
    //TODO no need to declare private variable as static here
    private static String DEALS_PAGE_TITLE = "Deals and Promotions";
    private DealsAndPromotionsPage dealsAndPromotionsPage;

    public DealsAndPromotionsPage(RemoteWebDriver driver) {
        super(driver);
    }
    
    //TODO can we please extract locator into a variable?
    public boolean isItDealsAndPromotionsPage(String dealsAndPromotions) {
        return driver.findElement(By.xpath("//div[@class='fst-h1-st pageBanner']//b[contains(text(),'Deals and Promotions')]")).getText().equals(DEALS_PAGE_TITLE);
    }

}
