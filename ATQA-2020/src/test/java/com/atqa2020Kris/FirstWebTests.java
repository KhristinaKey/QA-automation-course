package com.atqa2020Kris;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstWebTests {
    private RemoteWebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
        // 01
        @Test(priority = 0, suiteName = "main")
        public void mainUrlTest() {
            //Given user opens a browser nd provides a valid url
            driver.get("https://amazon.com");
            //when user clicks enter

            //And

            //Then user is redirected to the main page
            Assert.assertTrue(driver.findElement(By.xpath("//input[@id='nav-logo-sprites']")).isDisplayed());
        }
    }


/*
    // 02
    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {
        //Given user opens a browser nd provides a valid url
        driver.get("https://amazon.com")
        //when user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//input[]")).isDisplayed());
    }
    // 03
    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {
        //Given user opens a browser nd provides a valid url
        driver.get("https://amazon.com")
        //when user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//input[]")).isDisplayed());
    }

    // 04
    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {
        //Given user opens a browser nd provides a valid url
        driver.get("https://amazon.com")
        //when user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//input[]")).isDisplayed());
    }
    // 05
    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {
        //Given user opens a browser nd provides a valid url
        driver.get("https://amazon.com")
        //when user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//input[]")).isDisplayed());
    }
*/

