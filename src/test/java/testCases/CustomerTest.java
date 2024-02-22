package testCases;

import org.apache.poi.ss.formula.functions.T;
import org.example.PageObjects.Customer;
import org.example.PageObjects.Login;
import org.example.PageObjects.OTP;
import org.testng.annotations.Test;

public class CustomerTest extends BasePage{

    Login lp;
    OTP otp;
    Customer customer;

    CustomerTest() {

}

@Test(priority = 2)
public void test1() throws InterruptedException {
    lp = new Login(driver);
    otp = new OTP(driver);
    customer = new Customer(driver);
    driver.get(baseURL);
    logger.info("URL is opened");
    Thread.sleep(5000);
    lp.setEmail(Email1);
    logger.info("entered email");
    lp.setPassword(Password1);
    logger.info("entered password");
    lp.clickLogin();
    /*
    String str=otp.getOTP();
    System.out.println("OTP code is :"+str);
    otp.setOTP(str);
    otp.clickVerifyOTP();
    logger.info("otp entered");
     */
    Thread.sleep(10000);
    customer.drpSidebar();
    customer.selectCustomer();
    customer.setCreateCustomer();
    customer.setCompanyName(companyName);
    customer.setSaveAndNext();
    Thread.sleep(5000);
    customer.setSaveAndNext();
    Thread.sleep(5000);
    customer.setSaveAndNext();
    Thread.sleep(5000);
    customer.setLandingDrpDown();
    Thread.sleep(5000);

}
    @Test(priority = 1)
    public void test2() throws InterruptedException {
        lp = new Login(driver);
        otp = new OTP(driver);
        customer = new Customer(driver);
        driver.get(baseURL);
        logger.info("URL is opened");
        Thread.sleep(5000);
        lp.setEmail(Email1);
        logger.info("entered email");
        lp.setPassword(Password1);
        logger.info("entered password");
        lp.clickLogin();
        /*
        String str=otp.getOTP();
        System.out.println("OTP code is :"+str);
        otp.setOTP(str);
        otp.clickVerifyOTP();
        logger.info("otp entered");
         */
        Thread.sleep(10000);
        customer.drpSidebar();
        customer.selectCustomer();
        customer.setCreateCustomer();
        customer.setFirstName(firstname1);
        customer.setLastName(lastname1);
        customer.setSaveAndNext();
        Thread.sleep(5000);
        customer.setSaveAndNext();
        Thread.sleep(5000);
        customer.setSaveAndNext();
        Thread.sleep(5000);
        customer.setLandingDrpDown();
        Thread.sleep(5000);
    }

@Test(priority = 0)
public void test3() throws InterruptedException {
    lp = new Login(driver);
    otp = new OTP(driver);
    customer = new Customer(driver);

    driver.get(baseURL);
    logger.info("URL is opened");
    Thread.sleep(5000);
    lp.setEmail(Email1);
    logger.info("entered email");
    lp.setPassword(Password1);
    logger.info("entered password");
    lp.clickLogin();
  //  String str=otp.getOTP();
  //  System.out.println("OTP code is :"+str);
  //  otp.setOTP(str);
  //  otp.clickVerifyOTP();
  //  logger.info("otp entered");
    Thread.sleep(5000);
    customer.drpSidebar();
    Thread.sleep(5000);
    customer.selectCustomer();
    Thread.sleep(5000);
    customer.setCreateCustomer();
    Thread.sleep(5000);

    //---------------------Company Detail----------------
    customer.setCompanyName(companyName);
    customer.setCompanyTINField(companyTINField);
    customer.setCompanyVATField(companyVATField);
    Thread.sleep(5000);
    customer.setCompanySizeDropdown();
    customer.setCompanySizeDropdownClick();

    //--------------------Contact Person------------------
    Thread.sleep(10000);
    customer.setSelectGender();
    customer.setElementOfGender();
    customer.setDesignation(designation1);
    Thread.sleep(5000);
    customer.setFirstName(firstName);
    customer.setLastName(lastName);
    customer.setCompanyPhoneField(companyPhoneField);
    customer.setCompanyFaxField(companyFaxField);
    customer.setCompanyMobileField(companyMobileField);
    customer.setCompanyEmail(companyEmail);

    //-------------------Additional Contact Person--------------

    Thread.sleep(5000);
    customer.setAddMorePerson();
    customer.setSelectGender();
    customer.setElementOfGender();
    customer.setAdditionalDesignation(additionalDesignation);
    Thread.sleep(5000);
    customer.setAdditionalFirstName(additionalFirstName);
    customer.setAdditionalLastName(additionalLastName);
    customer.setAdditionalPhoneNo(additionalPhoneNo);
    customer.setAdditionalfaxNumber(additionalFaxNumber);
    customer.setAdditionaMobile(additionalMobileNumber);
    customer.setAdditionalEmail(additionalEmail);
    customer.setCompanyPhoneField(companyPhoneField);
    customer.setCompanyFaxField(companyFaxField);
    customer.setCompanyMobileField(companyMobileField);
    customer.setCompanyEmail(companyEmail);
    customer.setDepartment(Dep);
    customer.setAdd();

//    -------------------Addresses-----------------------
    Thread.sleep(5000);
    customer.setAddress(address);
    customer.setStreetNo(streetNo);
    customer.setAddressSupplement(addressSupplement);
    customer.setCountry();
    Thread.sleep(5000);
    customer.setCountryDropdown();
    Thread.sleep(5000);
    customer.setCity();
    customer.setCityDropdown();
    customer.setPostalCode(postalCode);

//   -----------------Add More Addresses-----------------
    Thread.sleep(10000);
    customer.setAddMoreAddress();
    customer.setAdditionalAddress(AdditionalAddress);
    customer.setAdditionalStreetNo(AdditionalStreetNo);
    customer.setAdditionalAddressSupplement(AdditionalAddressSupplementNo);
    customer.setAdditionalCountryAddress();
    customer.setAdditionalCountryDropdown();
    Thread.sleep(5000);
    customer.setAdditionalCityAddress();
    customer.setAdditionalCityDropdown();
    customer.setAdditionalPostalCode(AdditionalPostalCode);
    Thread.sleep(10000);
    customer.setAdditionalAddressAddButton();
    customer.setSaveAndNext();
    Thread.sleep(5000);

//  -------------------Payment Details--------------------











/*
    customer.setPlaceholder();
    customer.setPriceGroupName(enterPriceGroupName);
    customer.setTextPriceGroup();
    customer.setClosePriceGroupDropdown();
    customer.setDiscountGroupPlaceholder();
    customer.setDiscountGroupName(enterDiscountGroupName);
    customer.setTextDiscountGroup();
    customer.setCloseDiscountGroupDropdown();
    customer.setSaveAndNextPersonalDetails();
    ----------------------------------------Company Details--------------------------------------------------
    customer.setCompanyNameField(companyNameField);
customer.setCompanyEmailField(companyEmailField);

    customer.setCompanyMobileField(companyMobileField);



    customer.setCompanyUrl(companyUrl);
    customer.setVatExempt();
    customer.setCompanyNameCompanyDetail(companyNameCompanyAddress);
    customer.setAddress_CompanyAddress(companyAddressCompanyAddresses);
    customer.setAddition();
    customer.setAdd_genderClick();
    customer.setAdd_gender();
    customer.setAdd_firstName(firstname1);
    customer.setAdd_lastName(lastname1);
    customer.setAdd_address(address1);
    customer.setSaveAndNext();
    customer.setBankDetails();
    customer.setIban(iban1);
    customer.setAccountOwnerName(accountHolderName);
    customer.setBic(bicBank);
    customer.setMendate(mendateReferenceNumber);
    customer.setMandateGenerateDate(mandateDATE);
    customer.setBankDetailsSaveAndNext();
    customer.setDiscount(discountAMOUNT );
    customer.setDiscountCash(discountCASH);
    customer.setDiscountSaveandNext();

*/
    }

}
