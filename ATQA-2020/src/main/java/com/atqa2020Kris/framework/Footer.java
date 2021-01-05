package com.atqa2020Kris.framework;

import com.atqa2020Kris.Pages.BlogPage;
import com.atqa2020Kris.Pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Footer {

    protected RemoteWebDriver driver;
    private String BlogLocator = "//a[contains(text(),'Blog')]";

    public Footer(final RemoteWebDriver driver) {
        this.driver = driver;
    }

    public BlogPage navigateToBlogPage() throws Exception {
        driver.findElement(By.xpath(BlogLocator)).click();
        return PageFactory.newPage(driver, BlogPage.class);
    }
}
