package com.polymer.pages;

import org.openqa.selenium.support.PageFactory;
import com.polymer.utilities.Driver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
