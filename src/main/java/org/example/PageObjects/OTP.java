package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.awt.SystemColor.text;

public class OTP {
    WebDriver ldriver;
    WebDriver wait;
    public OTP(WebDriver driver) {
        System.out.println("driver value: "+ driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(id = "1")
    WebElement Field1;

    @FindBy(xpath = "//input[@id='2']")
    WebElement Field2;

    @FindBy(id = "3")
    WebElement Field3;

    @FindBy(id = "4")
    WebElement Field4;

    @FindBy(xpath = "//div[contains(text(),'Otp')]")
    WebElement Text;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement VerifyOtp;

    public void setField1(String field1) {
        Field1.sendKeys(field1);
    }

    public String getOTP() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Otp')]")));
        String temp = Text.getText();
        int stringLength = temp.length();
        return temp.substring(stringLength - 4, stringLength);
    }

    public String setOTP(String str) {
//        if (str.matches("\\d{4}")) {
            Field1.sendKeys(Character.toString(str.charAt(0)));
            Field2.sendKeys(Character.toString(str.charAt(1)));
            Field3.sendKeys(Character.toString(str.charAt(2)));
            Field4.sendKeys(Character.toString(str.charAt(3)));
//        }
        return str;
    }
        public void setField2 (String field2){
            Field2.sendKeys(field2);
        }

        public void setField3 (String field3){
            Field3.sendKeys(field3);
        }

        public void setField4 (String field4){
            Field4.sendKeys(field4);
        }

        public void setText (String text){
            Text.sendKeys(text);
        }

        public void clickVerifyOTP () {
           WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3000));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
            VerifyOtp.click();
        }
    }


