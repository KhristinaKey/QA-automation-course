package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CartPage extends Page{

    public Header header;

    private static String CART_PAGE_TITLE = "Your Amazon Cart is empty";

    public CartPage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    //span[contains(text(),'Sign up now')]

}
