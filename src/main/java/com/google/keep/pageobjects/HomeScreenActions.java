package com.google.keep.pageobjects;

import com.google.keep.config.AppiumBaseDriver;
import com.google.keep.config.BaseSetup;
import com.google.keep.helper.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomeScreenActions extends AppiumBaseDriver {

    HomeScreenLocators homeScreenLocators;
    public HomeScreenActions(AppiumDriver driver) {
        this.homeScreenLocators=new HomeScreenLocators(driver);
    }

    public void addNotesUPlusButton(){
       Helper.SingleTap((MobileElement) homeScreenLocators.getCreateNotePlusBtn());
    }

    public void verifyEmptyNotesDashboard(){

        BaseSetup.softAssert.assertTrue(homeScreenLocators.getVerifyBulbIconForNoNotes().isDisplayed());
    }

    public void changeToMultiGridView(){
        Helper.SingleTap((MobileElement) homeScreenLocators.getSingleColumnView());
        BaseSetup baseSetup=new BaseSetup();
        BaseSetup.softAssert.assertTrue(homeScreenLocators.getMultiColumnView().isDisplayed());
    }
}
