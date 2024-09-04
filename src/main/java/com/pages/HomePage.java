package com.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public HomePage(AppiumDriver driver) {
        super(driver);
    }
    private final By sideMenu= By.xpath("//*[@class='slicknav_btn slicknav_collapsed']");


    private final By testScenario= By.xpath("//body[@id='mh-mobile']/div/header/div[2]/div/nav/div/ul/li[5]/a");


    public void openSideMenu(){
        waitForVisibility(sideMenu);
        clickElement(sideMenu);
    }
    public void selectTestScenario(){
        waitForVisibility(testScenario);
        clickElement(testScenario);
    }
}
