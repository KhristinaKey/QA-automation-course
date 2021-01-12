package com.atqa2020Kris;
import com.atqa2020Kris.listeners.TestListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import static org.apache.commons.lang3.SystemUtils.*;

@Listeners(TestListener.class)

public abstract class BaseTest {
    protected RemoteWebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        if (IS_OS_MAC || IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        } else if (IS_OS_WINDOWS) {
            System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        }

        driver = new ChromeDriver();
       // driver.manage().window().maximize();
        System.out.println("setup");
        //TODO please remove redundant lines of code
        // driver.get("https://amazon.com");
        //  homePage = new HomePage(driver);
        // HomePage homePage = new HomePage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown");
    }

}
