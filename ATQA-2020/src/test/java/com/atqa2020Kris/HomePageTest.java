package com.atqa2020Kris;

import com.sun.webkit.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
/*
public class HomePageTest {

    private RemoteWebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() {
        if (driver != null)
            driver.quit();
    }

/*
    @BeforeTest
    public void  setup() {
        System.out.println("before test class");
    }
    @AfterTest
    public void tearDown(){
        System.out.println("after test class");
    }
*/
/*
    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {

        //Given user opens a browser and provides a valid url
        driver.get("https://google.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isDisplayed());
    }
}


*/
