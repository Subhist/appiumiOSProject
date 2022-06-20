package com.google.keep.config;

import com.google.keep.pageobjects.AddNotesPageActions;
import com.google.keep.pageobjects.AddNotesPageLocators;
import com.google.keep.pageobjects.HomeScreenActions;
import com.google.keep.pageobjects.HomeScreenLocators;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSetup extends AppiumBaseDriver{
    private String deviceName;
    private String platformVersion;
    private String bundleid;
    private String env;
    private String yourlaptopusername;

    public HomeScreenLocators homeScreenLocators;
    public HomeScreenActions homeScreenActions;
    public AddNotesPageLocators addNotesPageLocators;
    public AddNotesPageActions addNotesPageActions;









    public static SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {


        FileInputStream fileInputStream = new FileInputStream("src/main/resources/deviceDetails.properties");

        Properties properties = new Properties();
        properties.load(fileInputStream);
        this.deviceName = properties.getProperty("devicename");
        System.out.println(this.deviceName);
        this.platformVersion = properties.getProperty("osversion");
        this.bundleid = properties.getProperty("bundleid");
        this.env = properties.getProperty("environment");
        this.yourlaptopusername = properties.getProperty("yourlaptopusername");


        DesiredCapabilities capabilities = new DesiredCapabilities();


        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("deviceName", this.deviceName);
        capabilities.setCapability("udid", this.deviceName);
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", this.platformVersion);
        capabilities.setCapability("systemPort", "8200");
        capabilities.setCapability("app", "/Users/" + this.yourlaptopusername + "/Downloads/iosbuilds/Payload/App.app");
        capabilities.setCapability("bundleId", this.bundleid);
        capabilities.setCapability("wdaLocalPort", 8101);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("appium:shouldTerminateApp", true);
        driver = DriverConfig.getInstance().setDriver(new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

        DriverConfig.getInstance().getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        this.softAssert=new SoftAssert();
        this.homeScreenLocators=new HomeScreenLocators(driver);
        this.homeScreenActions=new HomeScreenActions(driver);
        this.addNotesPageLocators=new AddNotesPageLocators(driver);
        this.addNotesPageActions=new AddNotesPageActions(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        driver.quit();
    }
}


