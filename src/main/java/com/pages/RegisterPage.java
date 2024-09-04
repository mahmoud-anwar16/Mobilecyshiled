package com.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(AppiumDriver driver) {
        super(driver);
    }

    private final By userId=By.xpath("//*[@name='userid']");
    private final By password=By.xpath("//*[@name='passid']");
    private final By name=By.xpath("//*[@name='username']");
    private final By address= By.xpath("//*[@name='address']");
    private final By country=By.xpath("//select[@name=\"country\"]");
    private final By zipCode=By.xpath("//*[@name='zip']");
    private final By email=By.xpath("//*[@name='email']");
    private final By registerBtn= By.xpath("//input[@name=\"submit\" and @value=\"REGISTER\"]");


    public void enterUserId(int id){
        waitForVisibility(userId);
        isDisplayed(userId);
        sendKeys(userId, String.valueOf(id));
    }
    public void setPassword(int pass){
        isDisplayed(password);
        sendKeys(password, String.valueOf(pass));
    }
    public void setName(String n){
        isDisplayed(name);
        sendKeys(name,n);
    }
    public void setAddress(String location){
        isDisplayed(address);
        sendKeys(address,location);
    }
    public void selectCountry(){
       isDisplayed(country);
       //clickElement(country);
       selectByIndex(country,"AF");
    }
    public void setZipCode(int zip){
        isDisplayed(zipCode);
        sendKeys(zipCode, String.valueOf(zip));
    }
    public void setEmail(String mail){
        isDisplayed(email);
        sendKeys(email,mail);
    }
public void clickRegister(){
        driver.hideKeyboard();
        isDisplayed(registerBtn);
        clickElement(registerBtn);
}
public String getErrorMessage(){
     return getAlertText();
}







}
