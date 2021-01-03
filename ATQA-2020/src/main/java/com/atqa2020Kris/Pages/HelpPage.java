package com.atqa2020Kris.Pages;

import org.openqa.selenium.remote.RemoteWebDriver;

public class HelpPage extends Page{
    private final String helpPageLocator= "//a[contains(text(),'Help')]";

    public HelpPage (RemoteWebDriver driver) {

        super(driver);
    }
}
