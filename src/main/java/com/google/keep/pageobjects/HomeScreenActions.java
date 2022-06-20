package com.google.keep.pageobjects;

import com.google.keep.config.AppiumBaseDriver;
import io.appium.java_client.AppiumDriver;

public class HomeScreenActions extends AppiumBaseDriver {

    HomeScreenLocators homeScreenLocators;
    public HomeScreenActions(AppiumDriver driver) {
        this.homeScreenLocators=new HomeScreenLocators(driver);
    }
}
