package testCases;

import org.example.PageObjects.Login;
import org.example.PageObjects.OTP;
import org.testng.annotations.Test;

public class LoginTest extends BasePage{

    LoginTest(){

    }

    @Test
    public void loginTest() throws InterruptedException {
        Login lp = new Login(driver);
        OTP otp = new OTP(driver);
        driver.get(baseURL);

        Thread.sleep(5000);
        lp.setEmail(Email1);
        lp.setPassword(Password1);
        lp.clickLogin();
        String str=otp.getOTP();
        System.out.println("OTP code is :"+str);
        otp.setOTP(str);
        Thread.sleep(5000);
        otp.clickVerifyOTP();
        Thread.sleep(5000);
    }
//        Thread.sleep(10000);

}


