package com.google.keep.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverConfig {

    private static DriverConfig config = null;
    private AppiumDriver driver = null;
    private IOSDriver driver1=null;

    /*Method to get instance of driver */
    public static DriverConfig getInstance(){

        synchronized (DriverConfig.class) {
            if (config == null)  {
                config = new DriverConfig();
            }
        }
        return  config;
    }

    /*Method to generate driver */
    public AppiumDriver getDriver() {
        return driver;
    }

    /*Method to set driver */
    public AppiumDriver setDriver(IOSDriver iosDriver) {
        return this.driver=iosDriver ;
    }

}
