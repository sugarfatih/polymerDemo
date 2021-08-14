package com.polymer.step_definitions;

import com.polymer.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
