package com.atqa2020Kris.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchResultPage extends Page{

    private String fourPlusReviewSelector = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private String inputPriceLocator = "//input[@id='low-price']";
    private String priceSubmitButtonLocator = "//span[@class='a-button a-spacing-top-mini a-button-base s-small-margin-left']//input[@type='submit']";
    private String searchResultListLocator = "//*[@data-component-type='s-search-result']";
    private String sponsoredLabelLocator = ".//span[@class='a-color-secondary']";
    private String item4PlusRatingLocator = ".//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']";
    private String wholePriceLocator = ".//span[@class='a-price-whole']";

    public SearchResultPage(RemoteWebDriver driver) {
        super(driver);
    }
    public SearchResultPage selectFourPlusCustomerReviewRating() {
        return clickOnElement(By.xpath(fourPlusReviewSelector), SearchResultPage.class);
    }
    public SearchResultPage setMinimalPrice() {
        return setText(By.xpath(inputPriceLocator), SearchResultPage.class);
    }
    public SearchResultPage submitPrice() {
        return clickOnElement(By.xpath(priceSubmitButtonLocator), SearchResultPage.class);
    }

    public boolean isExpectedConditionsMet() {

        return false;
    }
}
