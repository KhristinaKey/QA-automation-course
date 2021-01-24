package com.atqa2020Kris;
import com.atqa2020Kris.listeners.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.apache.commons.lang3.SystemUtils.*;

private static final String DEFAULT_ENV_PROPERTIES_FILE_PATH = "src/test/resources/test.properties";
private static final String DEFAULT_ENV_REMOTE_PROPERTIES_FILE_PATH = "src/test/resources/remote.properties";
private static String EXCEL_DATA_FILE_PATH =  "src/test/resources/TestData.xlsx";
protected RemoteWebDriver driver = null;
private static Properties properties;
protected static ExcelReader excelReader;
protected WebDriverWait wait;
protected PageNavigator pageNavigator;



@Listeners(TestListener.class)
public abstract class BaseTest {

    protected RemoteWebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        if (IS_OS_MAC || IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();
        } else {
            if (IS_OS_WINDOWS) {
                System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
                driver = new ChromeDriver();
            }
             }
        driver.manage().window().maximize();
        System.out.println("setup");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown");
    }

    protected boolean isElementDisplayed(By selector) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            return driver.findElement(selector).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    protected boolean isURLValid(String expectedURL) {
        return driver.getCurrentUrl().contains(expectedURL);
    }

    protected ExcelReader getExcelReader() {
        if (excelReader == null) {
            this.excelReader = new ExcelReader(EXCEL_DATA_FILE_PATH);
        }
        return excelReader;
    }

    protected String getBrowser() {
        return getProperty("test.browser");
    }

    protected String getTimeouts() {
        return getProperty("test.timeout");
    }

    protected String getMainUrl() {
        String result;
        if (getProperty("test.isLocal").equals("true")) {
            result = properties.getProperty("test.mainUrl");
        } else {
            result = properties.getProperty("test.qaUrl");
        }
        return (result != null) ? result.trim() : null;
    }

    protected String getProperty(String key) {
        String result = properties.getProperty(key);
        return (result != null) ? result.trim() : null;
    }

    private static void loadPropertiesFromFile(String propertiesFilePath) {
        try {
            InputStream propertiesStream;
            propertiesStream = new FileInputStream(new File(propertiesFilePath).getPath());
            properties.load(propertiesStream);
        } catch (Exception ex) {
            Helper.Logger.LogError("Property file wasn't loaded", ex);
        }
    }


}
