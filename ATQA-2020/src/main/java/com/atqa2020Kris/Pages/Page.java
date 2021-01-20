package com.atqa2020Kris.Pages;
import com.atqa2020Kris.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class Page {
    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public Page(final RemoteWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 3);
    }
    protected <T extends Page>T clickOnElement(By selector, Class<T> clazz) {
        try {
            wait.until(ExpectedCondition.visibilityOfElementLocated(selector));
            driver.findElement(selector).click();
            return PageFactory.newPage();
        } catch (Exception ex) {
            Helper.Logger.LogError("Element is not clickable", ex);
            return null;
        }
    }
    protected <T extends Page>T setText(By selector, Class<T> clazz) {
        try {
            wait.until(ExpectedCondition.visibilityOfElementLocated(selector));
            driver.findElement(selector).click();
            return PageFactory.newPage();
        } catch (Exception ex) {
            Helper.Logger.LogError( "Can't send keys", ex);
            return null;
        }
    }
    protected WebElement getElement(By selector) {
        try {
            wait.until(ExpectedCondition.visibilityOfElementLocated(selector));
            return driver.findElement(selector);
        } catch (Exception ex) {
            Helper.Logger.LogError("Element is not present", ex);
            return null;
        }
    }
    protected List<WebElement> getElements(By selector, Class<T> clazz) {
        try {
            wait.until(ExpectedCondition.visibilityOfElementLocated(selector));
            return driver.findElements(selector);
        } catch (Exception ex) {
            Helper.Logger.LogError("Element is not clickable", ex);
            return null;
        }
    }

    protected boolean isDisplayed (WebElement element, By selector) {
        try {
            return element.findElement(selector).isDisplayed();
        } catch (Exception ex) {
            Helper.Logger.LogError("Element is not present", ex);
            return false;
        }
    }

}
