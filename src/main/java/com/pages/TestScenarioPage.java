package com.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class TestScenarioPage extends BasePage{
    public TestScenarioPage(AppiumDriver driver) {
        super(driver);
    }

    private final By registerForm= By.xpath("//div[@id=\"main-content\"]/article[2]/div/header/h3/a");


    public void openRegisterForm(){
        waitForVisibility(registerForm);
        clickElement(registerForm);
    }
}
