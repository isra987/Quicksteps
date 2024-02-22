package testCases;

import org.example.PageObjects.Login;
import org.example.PageObjects.OTP;
import org.example.PageObjects.expenditure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class expenditureTest extends BasePage {

    @Test
    public void expenditureTest() throws InterruptedException {
        Login lp = new Login(driver);
        OTP otp = new OTP(driver);
        expenditure Expenditure = new expenditure(driver);

        driver.get(baseURL);
        lp.setEmail(Email1);
        lp.setPassword(Password1);
        lp.clickLogin();
        logger.info("user logged in");
        String str=otp.getOTP();
        System.out.println("OTP code is :"+str);
        otp.setOTP(str);
        otp.clickVerifyOTP();
        logger.info("otp entered");
        Expenditure.setExpenses();
        Expenditure.setExpenditure();
        Expenditure.setCreateExpenditure();
        logger.info("redirect on create expenditure");
        Expenditure.setContact();
        logger.info("contact person selected");
        Expenditure.setCategory(category1);
        Thread.sleep(3000);
        logger.info("New category added");
        Expenditure.selectCategory();
        Thread.sleep(5000);
        logger.info("New category entered");
        Expenditure.setCashDiscount(cashDiscount1);
        logger.info("Discount amount entered");
        Thread.sleep(5000);
        Expenditure.setDiscountValidityDate(discountValidityDate1);
        logger.info("Cash discount validity date entered");
        Expenditure.setVatNumber(vatNumer1);
        logger.info("Vat number entered");
        Expenditure.setBankAccount(bankAccount1);
        logger.info("Bank account entered");
        Expenditure.setPaymentAmount(paymentAmount1);
        logger.info("Payment amount enterd");
        Expenditure.setTaxRate();
        logger.info("Tax rate selected");
        Expenditure.setDueDate(dueDate1);
        logger.info("Due Date entered");
        Expenditure.setDescription(desc1);
        logger.info("Description entered");
        Expenditure.setSave();
        logger.info("Details saved");
        Thread.sleep(5000);



    }
    }

