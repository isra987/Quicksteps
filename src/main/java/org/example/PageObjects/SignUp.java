package org.example.PageObjects;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class SignUp {
    WebDriver ldriver;

    public SignUp(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//input[@name='userName']")
    WebElement Username;

    @FindBy(name = "email")
    WebElement Email;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//img[@alt=\"\"][1]")
    WebElement Checkbox;

    @FindBy (xpath = ".//button[@type = 'submit']")
    WebElement SignupButtom;

    public void setUserName(String uName){
        Username.sendKeys(uName);
    }

    public void setPassword(String pwd){
        Password.sendKeys(pwd);
    }

    public void setEmail(String mail){
        Email.sendKeys(mail);
    }

    public void setCheckbox(){
        Checkbox.click();
    }
    public void clickSignup(){
        SignupButtom.click();
    }

    public static String generateRandomEmail() {
        System.out.println("quickstepstest+" + RandomStringUtils.randomNumeric(5) + "@gmail.com");
        return "quickstepstest+" + RandomStringUtils.randomNumeric(5) + "@gmail.com";
    }

    public static String generateRandomUsername() {
        return "quickstepstest" + RandomStringUtils.randomNumeric(5);
    }


    }