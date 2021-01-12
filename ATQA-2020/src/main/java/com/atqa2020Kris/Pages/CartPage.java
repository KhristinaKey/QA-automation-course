package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CartPage extends Page{

    //TODO we don't use Header here so no need to include it
    public Header header;

    private static String CART_PAGE_TITLE = "Your Amazon Cart is empty";

    public CartPage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    //TODO if this is not required, please remove it
    //span[contains(text(),'Sign up now')]

}
