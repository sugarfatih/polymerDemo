package com.polymer.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

    // Performs double click action on an element
    public static void doubleClick(WebElement element) {
        new Actions(Driver.get()).doubleClick(element).build().perform();

    }

}
