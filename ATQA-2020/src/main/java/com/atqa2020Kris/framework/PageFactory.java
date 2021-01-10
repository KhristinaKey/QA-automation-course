package com.atqa2020Kris.framework;

import com.atqa2020Kris.Pages.Page;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.lang.reflect.Constructor;

public class PageFactory {

    public static <T extends Page>T newPage(RemoteWebDriver driver, Class<T> clazz) throws Exception {
    return getNewInstance(driver, clazz);
    }
    private static <T> T getNewInstance(RemoteWebDriver driver, Class<T> clazz) throws Exception {
        try {
            Constructor<T> constructor = clazz.getConstructor(RemoteWebDriver.class);
            constructor.setAccessible(true);
            return constructor.newInstance(driver);
        } catch (Exception ex) {
            throw  new Exception(ex.getCause().toString(), ex);
        }
    }
}
