package com.google.keep.helper;

import com.google.keep.config.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;

public class Helper {
    public static void SingleTap(MobileElement element) {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) DriverConfig.getInstance().getDriver());
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }

    public static void tapAndHold(MobileElement element) {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) DriverConfig.getInstance().getDriver());
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement (ElementOption.element (element)))
                .perform ();
    }



    public static String generateRandomString(){
        String generatedString = RandomStringUtils.random(10, true, false);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        return generatedString+ " "+timestamp;
    }


    public static WebElement waitForElementToBeVisible(WebElement elementToBeLoaded) {


        WebDriverWait wait = new WebDriverWait(DriverConfig.getInstance().getDriver(), 24);
        return (WebElement) wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
    }
}
