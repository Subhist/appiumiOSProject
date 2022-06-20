package com.google.keep.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddNotesPageLocators {

    public AddNotesPageLocators(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


}
