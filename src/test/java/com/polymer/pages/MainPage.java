package com.polymer.pages;

import com.polymer.utilities.Driver;
import org.openqa.selenium.By;

public class MainPage {

    public void selectTab(String tabName) {
        String dynamicLocator = "//div[contains(text(),'" + tabName + "')]";
        Driver.get().findElement(By.xpath(dynamicLocator)).click();
    }

    public void selectSubElement(String subElementName) {
        Driver.get().findElement(By.linkText(subElementName)).click();
    }

}
