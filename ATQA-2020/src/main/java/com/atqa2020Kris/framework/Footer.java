package com.atqa2020Kris.framework;
import com.atqa2020Kris.Pages.BlogPage;
import com.atqa2020Kris.Pages.HelpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Footer extends GeneralElements{

    private String blogPageLinkLocator = "//a[contains(text(),'Blog')]";
    private String helpPageLinkLocator = "//a[contains(text(),'Help')]";
    protected RemoteWebDriver driver;

    public Footer(final RemoteWebDriver driver) {
        this.driver = driver;
    }
    public BlogPage navigateToBlogPage() throws Exception {
        driver.findElement(By.xpath(blogPageLinkLocator)).click();
        return PageFactory.newPage(driver, BlogPage.class);
    }
    public HelpPage navigateToHelpPage() throws Exception {
        driver.findElement(By.xpath(helpPageLinkLocator)).click();
        return PageFactory.newPage(driver, HelpPage.class);
    }
}
