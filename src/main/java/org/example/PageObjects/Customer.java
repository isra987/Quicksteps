package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Customer {
    WebDriver ldriver;
    WebDriverWait wait;

    public Customer(WebDriver driver) {
        System.out.println("driver value: " + driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Administrations')]")
    WebElement clickDrp;

    @FindBy(xpath = "//span[contains(text(),'Customer')]")
    WebElement selCustomer;

    @FindBy(xpath = "//a[@type='button']")
    WebElement createCustomer;

    @FindBy(css = "body > div > div.content.tw-basis-5\\/6.tw-bg-secondary-gray > div.navbar-main > div > div.tw-flex.tw-items-center.xs\\:tw-gap-2.lg\\:tw-gap-6 > div.MuiBox-root.css-5nwj3y > button > div > span")
    WebElement landingDrpDown;

    @FindBy(xpath = "//li[@role='menuitem'][2]")
    WebElement logout;

    @FindBy(name = "companyName")
    WebElement companyName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveAndNext;

    @FindBy(name = "tin")
    WebElement companyTINField;

    @FindBy(name = "vat")
    WebElement companyVATField;

    @FindBy(xpath = "//div[@id='mui-component-select-companySize']")
    WebElement companySizeDropdown;

    @FindBy(xpath = "//p[contains(text(),'Select Gender')]")
    WebElement selectGender;

    @FindBy(name = "designation")
    WebElement designation;

    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "companyPhone")
    WebElement companyPhoneField;

    @FindBy(xpath = "//div[@class=\"tw-relative tw-w-full \"]/div/input[@name='companyFax']")
    WebElement companyFaxField;

    @FindBy(name = "companyMobile")
    WebElement companyMobileField;

    @FindBy(xpath = "//input[@name='companyEmail']")
    WebElement companyEmail;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")
    WebElement AddMorePerson;

    @FindBy(xpath = "//input[@name='additionalDesignation']")
    WebElement additionalDesignation;

    @FindBy(name = "additionalFirstName")
    WebElement additionalFirstName;

    @FindBy(xpath = "//input[@name='additionalLastName']")
    WebElement additionalLastName;

    @FindBy(name = "additionalPhone")
    WebElement additionalPhoneNo;

    @FindBy(name = "additionalFax")
    WebElement additionalfaxNumber;

    @FindBy(name = "additionalMobile")
    WebElement additionaMobile;

    @FindBy(name = "additionalEmail")
    WebElement additionalEmail;

    @FindBy(xpath = "//input[@name='additionalDepartment']")
    WebElement Dep;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[5]/div[10]/div/button[2]")
    WebElement Add;

    @FindBy(xpath = "//input[@name='address']")
    WebElement address;

    @FindBy(xpath = "//input[@name='streetNo']")
    WebElement streetNo;

    @FindBy(xpath = ".//input[@name='addressSupplement']")
    WebElement addressSupplement;

    @FindBy(xpath = "//p[contains(text(),'Select Country')]")
    WebElement country;

    @FindBy(css = "#mui-component-select-city")
    WebElement city;

    @FindBy(name = "postalCode")
    WebElement postalCode;

    @FindBy(xpath = "//button[contains(text(),'Add more address')]")
    WebElement AddMoreAddress;

    @FindBy(xpath = "//input[@name='additionalAddress']")
    WebElement AdditionalAddress;

    @FindBy(xpath = "//input[@name='additionalStreetNo']")
    WebElement AdditionalStreetNo;

    @FindBy(xpath = "//input[@name='additionalAddressSupplement']")
    WebElement AdditionalAddressSupplement;

    @FindBy(css = "#mui-component-select-additionalCountry")
    WebElement AdditionalCountryAddress;

    @FindBy(css = "#mui-component-select-additionalCity")
    WebElement AdditionalCityAddress;

    @FindBy(xpath = ".//input[@name='additionalPostalCode']")
    WebElement AdditionalPostalCode;

    @FindBy(xpath = ".//button[@class='MuiButtonBase-root MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium btn tw-font-dm   bnt btn-secondary css-5bcq5j']")
    WebElement AdditionalAddressAddButton;

    @FindBy(xpath = "//input[@placeholder='IBAN Number']/parent::div")
    WebElement iban;

/*

    @FindBy(xpath = "//input[@placeholder='Select Price Group(s)']")
    WebElement priceGroupPlaceholder;

    @FindBy(xpath = "//div[contains(text(), 'Create New Group')]")
    WebElement priceGroup;

    @FindBy(xpath = "//input[@name='priceGroupName']")
    WebElement enterPriceGroupName;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/form/div[2]/button[2]")
    WebElement submitPriceGroupName;

    @FindBy(xpath = "//input[@placeholder='Select Discount Group(s)']")
    WebElement discountGroupPlaceholder;

    @FindBy(xpath = "//div[contains(text(), 'Create New Group')]")
    WebElement createDiscountGroup;

    @FindBy(name = "discountGroupName")
    WebElement enterDiscountGroupName;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div/div[2]/form/div[2]/button[2]")
    WebElement submitDiscountGroup;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div/div/div/div/div[2]/div/button")
    WebElement closePriceGroupDropdown;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div/div/div/div/div[2]/div/button")
    WebElement closeDiscountGroupDropdown;

    @FindBy(xpath = "//button[@type='submit']//parent::div[@class='next-button']")
    WebElement saveAndNextPersonalDetails;







    @FindBy(name = "companyUrl")
    WebElement companyUrl;

    @FindBy(name = "vatStatus")
    WebElement vatExempt;

    @FindBy(name = "companyAddresses.0.addressLabel")
    WebElement companyNameCompanyDetail;

    @FindBy(name = "companyAddresses.0.address")
    WebElement Address_CompanyAddress;

    @FindBy(id = "mui-component-select-ac_gender")
    WebElement add_gender;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[5]/img")
    WebElement addition;

    @FindBy(name = "ac_designation")
    WebElement add_firstName;

    @FindBy(name = "ac_lastName")
    WebElement add_lastName;

    @FindBy(name = "ac_address")
    WebElement add_address;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveAndNext;

    @FindBy(xpath = "//input[@placeholder='IBAN Number']/parent::div")
    WebElement iban;

    @FindBy(name = "accountOwnerName")
    WebElement accountOwnerName;

    @FindBy(name = "bic")
    WebElement bic;

    @FindBy(name = "mendateReferance")
    WebElement mendate;

    @FindBy(name = "mandateGenerateDate")
    WebElement mandateGenerateDate;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement BankDetailsSaveAndNext;

    @FindBy(name = "discountAmount")
    WebElement discount;

    @FindBy(name = "discountDays")
    WebElement discountCash;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement discountSaveandNext;

    @FindBy(xpath = "//input[@class='PrivateSwitchBase-input css-1m9pwf3']")
    WebElement bankDetails;

 */

    public void drpSidebar() {
        clickDrp.click();
    }

    public void selectCustomer() {
        //  WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3000));
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Customer')]")));
        selCustomer.click();
    }

    public void setCreateCustomer() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@type='button']")));
        createCustomer.click();
    }

    public void setLandingDrpDown(){
        landingDrpDown.click();
        logout.click();
    }

    public void setCompanyName(String enterCompanyName){
        companyName.sendKeys(enterCompanyName);
    }

    public void setSaveAndNext(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[@type='submit']")));
        saveAndNext.click();
    }
    public void setCompanyTINField (String enterCompanyTINField){
        companyTINField.sendKeys(enterCompanyTINField);
    }

    public void setCompanyVATField(String enterCompanyVat){
        companyVATField.sendKeys(enterCompanyVat);
    }

    public void setCompanySizeDropdown() {
        companySizeDropdown.click();
    }

    public void setCompanySizeDropdownClick() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-value='10-30']")));
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-value='10-30']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("10-30")) {
                ele.click();
                break;
            }
        }
    }

    //-------------------------------------------------Contact Person-----------------------------------------------------
    public void setSelectGender() {
        selectGender.click();
    }

    public void setElementOfGender() {
        //  driver.findElement(By.xpath(".//div[contains(text(),'Select Gender')]")).click();
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value='FEMALE']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("Female")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }
    }

    public void setDesignation(String designation1) {
        designation.sendKeys(designation1);
    }

    public void setFirstName(String firstName11) {
        firstName.sendKeys(firstName11);
    }

    public void setLastName(String lastName1) {
        lastName.sendKeys(lastName1);
    }

    public void setCompanyPhoneField(String enterCompanyPhone) {
        companyPhoneField.sendKeys(enterCompanyPhone);
    }

    public void setCompanyFaxField(String entercompanyFaxField)  {
        companyFaxField.sendKeys(entercompanyFaxField);
    }

    public void setCompanyMobileField(String enterCompanyMobile) {
        companyMobileField.sendKeys(enterCompanyMobile);

    }

    public void setCompanyEmail(String enterCompanyEmail){
        companyEmail.sendKeys(enterCompanyEmail);
    }

    //------------------------------------------Add More Person-----------------------------------

    public void setAddMorePerson(){
        AddMorePerson.click();
    }

    public void setAdditionalDesignation(String enterAddDesignation){
        additionalDesignation.sendKeys(enterAddDesignation);
    }

    public void setAdditionalFirstName(String enterAddFirstName){
        additionalFirstName.sendKeys(enterAddFirstName);
    }

    public void setAdditionalLastName(String enterAddLastName){
        additionalLastName.sendKeys(enterAddLastName);
    }

    public void setAdditionalPhoneNo(String enterAddPhoneNo){
        additionalPhoneNo.sendKeys(enterAddPhoneNo);
    }

    public void setAdditionalfaxNumber(String enterAddFaxNumber){
        additionalfaxNumber.sendKeys(enterAddFaxNumber);
    }

    public void setAdditionaMobile(String enterAddMobile){
        additionaMobile.sendKeys(enterAddMobile);
    }

    public void setAdditionalEmail(String enterAddEmail){
        additionalEmail.sendKeys(enterAddEmail);
    }
   public void setDepartment(String enterDepartment){
        Dep.sendKeys(enterDepartment);
   }

   public void setAdd(){
        Add.click();
   }

    //---------------------------------------Addresses--------------------------------------------

    public void setAddress(String enterAddress){
        address.sendKeys(enterAddress);
    }

    public void setStreetNo(String enterStreetNo){
        streetNo.sendKeys(enterStreetNo);
    }

    public void setAddressSupplement(String enterAddressSupplement){
        addressSupplement.sendKeys(enterAddressSupplement);
    }
    public void setCountry() {
        country.click();
    }

    public void setCountryDropdown() {

     //   WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[contains(text(),'Select Country')]")));
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value='pakistan-PK']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("Pakistan")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }
    }

    public void setCity() {
        city.click();
    }

    public void setCityDropdown() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-value='lahore']")));
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value='lahore']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("Lahore")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }
    }

    public void setPostalCode(String postalCode1) {
        postalCode.sendKeys(postalCode1);
    }

    public void setAddMoreAddress(){
        AddMoreAddress.click();
    }

    public void setAdditionalAddress(String enterAdditionalAddress){
        AdditionalAddress.sendKeys(enterAdditionalAddress);
    }

    public void setAdditionalStreetNo(String enterAdditionalStreetNo){
        AdditionalStreetNo.sendKeys(enterAdditionalStreetNo);
    }

    public void setAdditionalAddressSupplement(String enterAdditionalAddressSupplement){
        AdditionalAddressSupplement.sendKeys(enterAdditionalAddressSupplement);
    }

    public void setAdditionalCountryAddress(){
        AdditionalCountryAddress.click();
    }

    public void setAdditionalCountryDropdown() {

        //   WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[contains(text(),'Select Country')]")));
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value='germany-DE']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("Germany")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }

    }
    public void setAdditionalCityAddress(){
        AdditionalCityAddress.click();
    }

    public void setAdditionalCityDropdown() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-value='ahlden']")));
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value='ahlden']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("Ahlden")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }
    }

    public void setAdditionalPostalCode(String enterAdditionalPostalCode){
        AdditionalPostalCode.sendKeys(enterAdditionalPostalCode);
    }

    public void setAdditionalAddressAddButton(){
        AdditionalAddressAddButton.click();
    }

    public void setIban(String enteriban) {
        iban.sendKeys(enteriban);
    }




/*

    //                       ------------Price Group-------------
    public void setPlaceholder() {
        priceGroupPlaceholder.click();
        priceGroup.click();

    }

    public void setPriceGroupName(String priceGroupName1) {
        String text = priceGroupName1;
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='priceGroupName']")));
        enterPriceGroupName.sendKeys(text);
        submitPriceGroupName.click();
    }

    public void setTextPriceGroup() {
        priceGroupPlaceholder.click();
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='tw-flex tw-max-h-[200px] tw-w-full tw-flex-col tw-overflow-y-auto']")));
        //    priceGroupPlaceholder.click();
        List<WebElement> option = ldriver.findElements(By.xpath(" //div[@class='tw-flex tw-max-h-[200px] tw-w-full tw-flex-col tw-overflow-y-auto']/div"));
        for (WebElement ele : option) {
            String text = ele.getText();
            System.out.println("list of price group is" + text);
            if (text.contains("price group1")) {
                System.out.println(ele.getText());
                System.out.println("condition true");
                ele.click();
                break;
            }
        }
    }

    public void setClosePriceGroupDropdown() {
        closePriceGroupDropdown.click();
    }

    //                      ---------------------Discount Group------------------------------
    public void setDiscountGroupPlaceholder() {
        discountGroupPlaceholder.click();
        createDiscountGroup.click();
    }

    public void setDiscountGroupName(String discountGroupName1) {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='discountGroupName']")));
        String text1 = discountGroupName1;
        enterDiscountGroupName.sendKeys(text1);
        submitDiscountGroup.click();
    }

    public void setTextDiscountGroup() {
        discountGroupPlaceholder.click();
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='noCloseOptions tw-flex tw-w-full tw-items-center']")));
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//div[@class='noCloseOptions tw-flex tw-w-full tw-items-center']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            System.out.println("List of Discount Group: " + text1);
            if (text1.contains("discount group 1")) {
                System.out.println("Condition true");
                ele.click();
                break;
            }
        }
    }

    public void setCloseDiscountGroupDropdown() {
        closeDiscountGroupDropdown.click();
    }

    //                 ----------------------Button----------------------------
    public void setSaveAndNextPersonalDetails() {
        saveAndNextPersonalDetails.click();
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']//parent::div[@class='next-button']")));
    }

        public void setCompanyUrl (String enterCompanyUrl){
            companyUrl.sendKeys(enterCompanyUrl);
        }

        public void setVatExempt(){
        vatExempt.click();
        }

        public void setCompanyNameCompanyDetail(String companyNameFromDetail){
        companyNameCompanyDetail.sendKeys(companyNameFromDetail);
        }

        public void setAddress_CompanyAddress(String enterAdd_CompanyAddress){
        Address_CompanyAddress.sendKeys(enterAdd_CompanyAddress);
        }

        public void setAdd_genderClick(){
        add_gender.click();
        }
    public void setAdd_gender() {

        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-value='FEMALE']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("Female")) {
                ele.click();
                break;
            }
        }
    }

    public void setAddition(){
        addition.click();
    }

    public void setAdd_firstName(String add_firstName1){
        add_firstName.sendKeys(add_firstName1);
    }

    public void setAdd_lastName(String add_lastName1){
        add_lastName.sendKeys(add_lastName1);
    }

    public void setAdd_address(String add_address1){
        add_address.sendKeys(add_address1);
    }

    public void setSaveAndNext(){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[@type='submit']")));
        saveAndNext.click();
    }

    public void setBankDetails(){
        //WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='PrivateSwitchBase-input css-1m9pwf3']")));
        bankDetails.click();
    }

    public void setIban(String enteriban) {
        ldriver.findElements(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/div/div/div"));
            iban.sendKeys(enteriban);
        }

    public void setAccountOwnerName(String enterAccountOwnerName){
        accountOwnerName.sendKeys(enterAccountOwnerName);
    }

    public void setBic(String enterBic){
        bic.sendKeys(enterBic);
    }

    public void setMendate(String entermendate){
        mendate.sendKeys(entermendate);
    }

    public void setMandateGenerateDate(String generateDate){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='mandateGenerateDate']")));
        mandateGenerateDate.click();
        mandateGenerateDate.sendKeys(generateDate);
    }

    public void setBankDetailsSaveAndNext(){
        BankDetailsSaveAndNext.click();
    }

    public void setDiscount(String enterDiscount){
        discount.sendKeys(enterDiscount);
    }

    public void setDiscountCash(String enterDiscountCash){
        discountCash.sendKeys("cash");
    }

    public void setDiscountSaveandNext(){
        discountSaveandNext.click();
    }


*/

}


