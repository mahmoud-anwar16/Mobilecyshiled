package com.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    private static final long WAIT = 10;
    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibility(By by) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void clickElement(By by) {
        driver.findElement(by).click();
    }

    protected boolean isDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    protected String getElementText(By by) {
        return driver.findElement(by).getText();
    }

    protected void sendKeys(By by, String e) {
        driver.findElement(by).sendKeys(e);
    }
    protected void selectByIndex(By locator, String value) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }
    protected String getAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        return alertText;
    }
}
