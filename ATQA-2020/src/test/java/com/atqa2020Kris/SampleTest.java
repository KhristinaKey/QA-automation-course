package com.atqa2020Kris;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    private RemoteWebDriver driver;

    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();

        //Given user opens a browser and provides a valid url
        driver.get("https://google.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isDisplayed());
    }
}
