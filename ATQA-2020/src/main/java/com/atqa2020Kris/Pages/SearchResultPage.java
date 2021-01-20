package com.atqa2020Kris.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchResultPage extends Page{
    private String fourPlusReviewSelector = "";
    public SearchResultPage(RemoteWebDriver driver) {
        super(driver);
    }
    public SearchResultPage selectFourPlusCustomerReviewRating() {
        clickOnElement(By.ByXPath(fourPlusReviewSelector))

    }
}
