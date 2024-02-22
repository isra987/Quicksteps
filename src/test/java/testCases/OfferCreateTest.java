package testCases;

import org.example.PageObjects.Login;
import org.example.PageObjects.OTP;
import org.example.PageObjects.OfferCreate;
import org.testng.annotations.Test;


public class OfferCreateTest extends BasePage{
    OfferCreate offercreate;
    Login lp ;
    OTP otp ;
    @Test
    public void OfferCreate() throws InterruptedException {
         offercreate = new OfferCreate(driver);
         lp = new Login(driver);
         otp = new OTP(driver);
        System.out.println("driver value before get: "+ driver);
        driver.get(baseURL);
        System.out.println("driver value after get: "+ driver);

        lp.setEmail(Email1);
        logger.info("email entered");
        lp.setPassword(Password1);
        logger.info("password entered");
        lp.clickLogin();
        logger.info("clicked on login");
        String str=otp.getOTP();
        System.out.println("OTP code is :"+str);
        otp.setOTP(str);
        otp.clickVerifyOTP();
        Thread.sleep(3000);
        logger.info("otp entered");
        Thread.sleep(5000);
        offercreate.clickDocuments();
        logger.info("Navigate on dashboard and clicked on documents");
        offercreate.clickOffer();
        logger.info("Clicked on offers under documents");
        offercreate.clickCreate();
        logger.info("Clicked on offer create");
        offercreate.select();
        logger.info("clicked on select customer search bar");
        offercreate.clickSelectOffer();
        logger.info("Customer selected");
        offercreate.setClickAddressLabel();
        logger.info("Address label selected");
        offercreate.setClickContactPerson();
        logger.info("Contact person selected");
        Thread.sleep(5000);
        offercreate.setClickSaveAndNext();
        logger.info("Clicked save and next");
        Thread.sleep(10000);
        offercreate.setClickBodyText();
        logger.info("Clicked on body text");
        offercreate.setBodyText(bodyText1);
        logger.info("Title entered");
        Thread.sleep(10000);
        offercreate.setTextField1(textField1);
        logger.info("Text entered");
        Thread.sleep(5000);
        offercreate.setAdd();
        logger.info("Clicked on Add button");

    }
}
