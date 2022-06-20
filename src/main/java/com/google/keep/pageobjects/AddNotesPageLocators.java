package com.google.keep.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddNotesPageLocators {

    public AddNotesPageLocators(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @FindBy(name = "Title")
    private WebElement title;

    @FindBy(name = "Note text")
    private WebElement noteText;

    @FindBy(name = "Go back")
    private WebElement goBackBtn;

    @FindBy(xpath = "//XCUIElementTypeCell")
    private WebElement verifyNotesOnHomeScreen;

    @FindBy(name = "Pin")
    private WebElement pinButton;

    @FindBy(name = "PINNED")
    private WebElement pinnedConfirmText;

    @FindBy(name = "Actions")
    private WebElement actionsUsingThreedots;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Delete\"]")
    private WebElement deletBtn;

    public WebElement getDeletBtn() {
        return deletBtn;
    }

    public void setDeletBtn(WebElement deletBtn) {
        this.deletBtn = deletBtn;
    }

    public WebElement getActionsUsingThreedots() {
        return actionsUsingThreedots;
    }

    public void setActionsUsingThreedots(WebElement actionsUsingThreedots) {
        this.actionsUsingThreedots = actionsUsingThreedots;
    }

    public WebElement getPinnedConfirmText() {
        return pinnedConfirmText;
    }

    public void setPinnedConfirmText(WebElement pinnedConfirmText) {
        this.pinnedConfirmText = pinnedConfirmText;
    }

    public WebElement getPinButton() {
        return pinButton;
    }

    public void setPinButton(WebElement pinButton) {
        this.pinButton = pinButton;
    }

    public WebElement getVerifyNotesOnHomeScreen() {
        return verifyNotesOnHomeScreen;
    }

    public void setVerifyNotesOnHomeScreen(WebElement verifyNotesOnHomeScreen) {
        this.verifyNotesOnHomeScreen = verifyNotesOnHomeScreen;
    }

    public WebElement getGoBackBtn() {
        return goBackBtn;
    }

    public void setGoBackBtn(WebElement goBackBtn) {
        this.goBackBtn = goBackBtn;
    }

    public WebElement getTitle() {
        return title;
    }

    public void setTitle(WebElement title) {
        this.title = title;
    }

    public WebElement getNoteText() {
        return noteText;
    }

    public void setNoteText(WebElement noteText) {
        this.noteText = noteText;
    }
}
