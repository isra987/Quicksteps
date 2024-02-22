package testCases;

import com.google.zxing.NotFoundException;
import org.example.PageObjects.DeliveryNote;
import org.example.PageObjects.Login;
import org.example.PageObjects.OTP;
import org.testng.annotations.Test;

import java.io.IOException;

import static testCases.BasePage.driver;

public class DeliveryNoteTest extends BasePage{
    Login lp;
    OTP otp;
    DeliveryNote deliverynote;
    DeliveryNoteTest(){

    }

    @Test
    public void test() throws InterruptedException, NotFoundException, IOException {
        lp = new Login(driver);
        otp = new OTP(driver);
        deliverynote = new DeliveryNote(driver);

        driver.get(baseURL);
        Thread.sleep(5000);
        lp.setEmail(Email1);
        lp.setPassword(Password1);
        lp.clickLogin();
        String str=otp.getOTP();
        System.out.println("OTP code is :"+str);
        otp.setOTP(str);
        otp.clickVerifyOTP();
        deliverynote.setClickDocuments();
        deliverynote.setClickDeliveryNote();
        deliverynote.setClickAction();
        deliverynote.setClickScanQRCode();
        deliverynote.getQRCode();
    }
}
