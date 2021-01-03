package com.atqa2020Kris.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;



public class DealsAndPromotionsPage extends Page{

    private final String todayDealsLocator = "//div[@id='nav-xshop']//a[@href='/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl']";

    public DealsAndPromotionsPage(RemoteWebDriver driver) {
        super(driver);
    }
    public boolean isItDealsAndPromotionsPage(String dealsAndPromotions) {
        return driver.findElement(By.xpath(todayDealsLocator)).click();
    }

}
