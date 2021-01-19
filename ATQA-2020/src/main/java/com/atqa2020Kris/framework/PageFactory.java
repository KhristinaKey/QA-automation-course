package com.atqa2020Kris.framework;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import com.atqa2020Kris.Pages.Page;
import java.lang.reflect.Constructor;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageFactory {
      public static <T extends Page> T newPage(RemoteWebDriver driver, Class<T> clazz) throws Exception {
        return getNewInstance(driver, clazz);
    }

    public static <T extends GeneralElements> T newElement(RemoteWebDriver driver, Class<T> clazz) throws Exception {
        return getNewInstance(driver, clazz);
    }

    private static <T> T getNewInstance(RemoteWebDriver driver, Class<T> clazz) throws Exception {
        try {
            Constructor<T> constructor = clazz.getConstructor(RemoteWebDriver.class);
            constructor.setAccessible(true);
            return constructor.newInstance(driver);
        } catch (Exception var3) {
            throw new Exception(var3.getCause().toString(), var3);
        }
    }
}
