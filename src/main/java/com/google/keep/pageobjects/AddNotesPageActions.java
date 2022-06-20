package com.google.keep.pageobjects;

import com.google.keep.config.AppiumBaseDriver;
import io.appium.java_client.AppiumDriver;

public class AddNotesPageActions extends AppiumBaseDriver {

    AddNotesPageLocators addNotesPageLocators;
    public AddNotesPageActions(AppiumDriver driver) {
        this.addNotesPageLocators=new AddNotesPageLocators(driver);
    }


}
