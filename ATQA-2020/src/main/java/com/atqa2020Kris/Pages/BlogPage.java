package com.atqa2020Kris.Pages;

import com.atqa2020Kris.framework.Footer;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BlogPage extends Page{
    private static String BLOG_PAGE_TITLE = "Who We Are";
    private String blogPageLinkLocator = "//a[contains(text(),'Blog')]";
        public BlogPage(RemoteWebDriver driver) {
        super(driver);
        }
    public boolean isTitleCorrect() {
       return driver.findElement(By.xpath(blogPageLinkLocator)).getText().equals(BLOG_PAGE_TITLE);
    }
}
