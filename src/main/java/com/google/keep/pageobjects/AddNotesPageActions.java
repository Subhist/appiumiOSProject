package com.google.keep.pageobjects;

import com.google.keep.config.AppiumBaseDriver;
import com.google.keep.config.BaseSetup;
import com.google.keep.helper.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import okhttp3.internal.http2.Header;

public class AddNotesPageActions extends AppiumBaseDriver {

    AddNotesPageLocators addNotesPageLocators;
    private String title;

    public AddNotesPageActions(AppiumDriver driver) {
        this.addNotesPageLocators=new AddNotesPageLocators(driver);
    }

    public void addTitle(){
        this.title=Helper.generateRandomString();
        addNotesPageLocators.getTitle().sendKeys(title);
    }

    public void addNotes(){
        addNotesPageLocators.getNoteText().sendKeys(Helper.generateRandomString());
    }

    public void goBackBtn(){
        Helper.SingleTap((MobileElement) addNotesPageLocators.getGoBackBtn());

    }

    public void verifyTitle(){

        BaseSetup.softAssert.assertTrue(addNotesPageLocators.getVerifyNotesOnHomeScreen().isDisplayed());
        BaseSetup.softAssert.assertTrue(addNotesPageLocators.getVerifyNotesOnHomeScreen().getText().contains(this.title));
    }

    public void editNotes(){
        Helper.SingleTap((MobileElement) addNotesPageLocators.getVerifyNotesOnHomeScreen());
    }

    public void pinNotes(){
        Helper.SingleTap((MobileElement) addNotesPageLocators.getPinButton());
        goBackBtn();
        BaseSetup.softAssert.assertTrue(addNotesPageLocators.getPinnedConfirmText().isDisplayed());
    }

    public void deleteNotes(){
        Helper.SingleTap((MobileElement) addNotesPageLocators.getActionsUsingThreedots());
        Helper.SingleTap((MobileElement) addNotesPageLocators.getDeletBtn());

    }



}
