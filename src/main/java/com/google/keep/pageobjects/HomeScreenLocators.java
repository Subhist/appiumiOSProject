package com.google.keep.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomeScreenLocators {

    public HomeScreenLocators(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(name = "Create note")
    private WebElement CreateNotePlusBtn;

    @FindBy(name = "Single column view")
    private WebElement singleColumnView;

    public WebElement getCreateNotePlusBtn() {
        return CreateNotePlusBtn;
    }

    public void setCreateNotePlusBtn(WebElement createNotePlusBtn) {
        CreateNotePlusBtn = createNotePlusBtn;
    }

    public WebElement getSingleColumnView() {
        return singleColumnView;
    }

    public void setSingleColumnView(WebElement singleColumnView) {
        this.singleColumnView = singleColumnView;
    }
}
