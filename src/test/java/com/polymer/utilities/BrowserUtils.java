package com.polymer.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {
    // Performs a pause @param seconds
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Performs double click action on an element  @param element
    public static void doubleClick(WebElement element) {
        new Actions(Driver.get()).doubleClick(element).build().perform();

    }

}
