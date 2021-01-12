package com.atqa2020Kris.framework;

import com.atqa2020Kris.Pages.BlogPage;
import com.atqa2020Kris.Pages.CartPage;
import com.atqa2020Kris.Pages.HelpPage;
import com.atqa2020Kris.Pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Footer {
    protected RemoteWebDriver driver;
    //TODO I do believe that this locator rather for a Link then for a Page Title, please rename
    private String blogPageTitleLocator = "//a[contains(text(),'Blog')]";
    private String helpPageTitleLocator = "//a[contains(text(),'Help')]";

    public Footer(final RemoteWebDriver driver) {
        this.driver = driver;
    }

    public BlogPage navigateToBlogPage() throws Exception {
        driver.findElement(By.xpath(blogPageTitleLocator)).click();
        return PageFactory.newPage(driver, BlogPage.class);
    }
    public HelpPage navigateToHelpPage() throws Exception {
        driver.findElement(By.xpath(helpPageTitleLocator)).click();
        return PageFactory.newPage(driver, HelpPage.class);
    }
}
