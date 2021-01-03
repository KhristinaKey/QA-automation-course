package com.atqa2020Kris.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BlogPage extends Page{

    private static String BLOG_PAGE_TITLE = "Who We Are";
    private String blogPageTitleLocator = "@/html/body/header/div[2]/ps-header/div/div[2]/div[2]/div[3]/div[1]/nav/ul/li[1]/div/div/div[1]/a";


    public BlogPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isTitleCorrect() {
       return driver.findElement(By.xpath(blogPageTitleLocator)).getText().equals(BLOG_PAGE_TITLE);
    }
}
