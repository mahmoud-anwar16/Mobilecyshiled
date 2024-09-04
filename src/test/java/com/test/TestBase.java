package com.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability( "chromedriverExecutable","/Users/admin/Downloads/chromedriver_mac64/chromedriver");
        caps.setCapability("appium:uiautomator2ServerLaunchTimeout", 60000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);

        driver.get("https://testing.todorvachev.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
