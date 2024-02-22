package org.example.PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver ldriver;
    public Login(WebDriver driver) {
        System.out.println("driver value: "+ driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement Email1;

    @FindBy(xpath = ".//input[@id='password']")
    WebElement Password1;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement LoginClick;

    @FindBy(id = "notistack-snackbar")
    WebElement GetText;

    @FindBy(xpath = "//div[@class='go946087465']")
    WebElement successMessage;

    public void setEmail(String email1) {
        Email1.sendKeys(email1);
    }

    public void setPassword(String pass) {
        Password1.sendKeys(pass);
    }

    public void clickLogin() {
        LoginClick.click();
    }

    public void setOTPText() {
        GetText.getText();
    }

    public String setSuccessMessage(){
        return successMessage.getText();
    }



}

