package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CartPage extends Page{

    public Header header;
    private final String cartPageLocator = "//span[@id='nav-cart-count']";
    private static String CART_PAGE_TITLE = "Your Amazon Cart is empty";

    public CartPage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }
    public boolean isItCartPage(String cart) {
        return driver.findElement(By.xpath(cartPageLocator)).click();
    }
    public boolean isTitleCorrect() {
        return driver.findElement(By.xpath(cartPageLocator)).getText().equals(CART_PAGE_TITLE);
    }
    //span[contains(text(),'Sign up now')]

}
