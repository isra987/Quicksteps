package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() {
        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream file = new FileInputStream(src);
            pro = new Properties();
            pro.load(file);
        } catch (Exception e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }
    public String getURL() {
        String baseUrl = pro.getProperty("baseURL");
        return baseUrl;
    }

    public String getLoginEmail(){
        String LoginEmail = pro.getProperty("Email1");
        return LoginEmail;
    }

    public String getLoginPassword(){
        String LoginPassword = pro.getProperty("Password1");
        return LoginPassword;
    }

    public String getCompanyName(){
        String c_Name = pro.getProperty("companyName");
        return c_Name;
    }

    public String getCompanyTINField(){
        String companyTIN = pro.getProperty("companyTINField");
        return companyTIN;
    }

    public String getCompanyVATField(){
        String companyVAT = pro.getProperty("companyVATField");
        return companyVAT;
    }

    public String getDesignation(){
        String designation = pro.getProperty("designation1");
        return designation;
    }

    public String getFirstName(){
        String firstName = pro.getProperty("firstName");
        return firstName;
    }

    public String getLastName(){
        String LastName = pro.getProperty("lastName");
        return LastName;
    }

    public String getCompanyPhoneField(){
        String companyPhone = pro.getProperty("companyPhoneField");
        return companyPhone;
    }

    public String getCompanyFaxField(){
        String companyFax = pro.getProperty("companyFaxField");
        return companyFax;
    }

    public String getCompanyMobileField(){
        String companyMobile = pro.getProperty("companyMobileField");
        return companyMobile;
    }

    public String getCompanyEmail(){
        String c_Email = pro.getProperty("companyEmail");
        return c_Email;
    }

    public String getAddtionalDesignation(){
        String add_Designation = pro.getProperty("additionalDesignation");
        return add_Designation;
    }

    public String getadditionalFirstName(){
        String add_FirstName = pro.getProperty("additionalFirstName");
        return add_FirstName;
    }

    public String getadditionalLastName(){
        String add_LastName = pro.getProperty("additionalLastName");
        return add_LastName;
    }

    public String getadditionalPhoneNo(){
        String add_PhoneNo = pro.getProperty("additionalPhoneNo");
        return add_PhoneNo;
    }

    public String getadditionalFaxNumber(){
        String add_FaxNo = pro.getProperty("additionalFaxNumber");
        return add_FaxNo;
    }

    public String getadditionalMobile(){
        String add_Mobile = pro.getProperty("additionalMobileNumber");
        return add_Mobile;
    }

    public String getadditionalEmail(){
        String add_Email = pro.getProperty("additionalEmail");
        return add_Email;
    }

    public String getDep(){
        String add_Dep = pro.getProperty("Dep");
        return add_Dep;
    }


    public String getAddress(){
        String address = pro.getProperty("address");
        return address;
    }

    public String getStreet(){
        String street = pro.getProperty("streetNo");
        return street;
    }

    public String getAddressSupplement(){
        String addressSupplement = pro.getProperty("addressSupplement");
        return addressSupplement;
    }

    public String getPostalCode(){
        String postalCode = pro.getProperty("postalCode");
        return postalCode;
    }

    public String getadditionalAddress(){
        String add_address = pro.getProperty("AdditionalAddress");
        return add_address;
    }
    public String getAdditionalStreet(){
        String add_Street = pro.getProperty("AdditionalStreetNo");
        return add_Street;
    }

    public String getAdditionalAddressSupplement(){
        String add_addressSupplement = pro.getProperty("AdditionalAddressSupplementNo");
        return add_addressSupplement;
    }



    public String getpriceGroup(){
        String priceGroupName = pro.getProperty("enterPriceGroupName");
        return priceGroupName;
    }

    public String getdiscountGoup(){
        String discountGroupName = pro.getProperty("enterDiscountGroupName");
        return discountGroupName;
    }

    public String getCompanyNameField(){
        String companyName = pro.getProperty("companyNameField");
        return companyName;
    }

    public String getCompanyEmailField(){
        String companyEmail = pro.getProperty("companyEmailField");
        return companyEmail;
    }





    public String getCompanyUrlField(){
        String companyUrl = pro.getProperty("companyUrl");
        return companyUrl;
    }

    public String getCompanyNameDetail(){
        String companyNameCompany = pro.getProperty("companyNameFieldDetail");
        return companyNameCompany;
    }

    public String getAddress_CompanyAddress(){
        String companyAddresses = pro.getProperty("Address_CompanyAddress");
        return companyAddresses;
    }

    public String getadd_firstName(){
        String firstname = pro.getProperty("add_firstName");
        return firstname;
    }

    public String getadd_lastName(){
        String lastname = pro.getProperty("add_lastName");
        return lastname;
    }

    public String getadd_address(){
        String address = pro.getProperty("add_address");
        return address;
    }
    public String getiban(){
        String ibann = pro.getProperty("iban");
        return ibann;
    }

    public String getaccountOwneraName(){
        String accountOwner =pro.getProperty("accountownername");
        return accountOwner;
    }

    public String getBic(){
        String bicNumber = pro.getProperty("BIC");
        return bicNumber;
    }

    public String getMendate(){
        String mendateNumber = pro.getProperty("mendateNumber");
        return mendateNumber;
    }

    public String getMandateGenerate(){
        String mandate = pro.getProperty("mandateGenerateDate");
        return mandate;
    }

    public String getDiscountAmount(){
        String discountAmountt = pro.getProperty("discountAmount");
        return discountAmountt;
    }

    public String getDiscountCash(){
        String cashDiscount = pro.getProperty("cash");
        return cashDiscount;
    }

    public String getBodyText(){
        String newbodyText = pro.getProperty("bodyText");
        return newbodyText;
    }

    public String getTextField(){
        String newtext = pro.getProperty("textField1");
        return newtext;
    }

    public String getcategoryName(){
        String newCategoryName = pro.getProperty("categoryName");
        return newCategoryName;
    }

    public String getCashDiscount(){
        String newCashDiscount = pro.getProperty("cashDiscount");
        return newCashDiscount;
    }

    public String getDiscountValidityDate(){
        String newDate = pro.getProperty("discountValidityDate");
        return newDate;
    }

    public String getVatNumber(){
        String newVat = pro.getProperty("VatNumber");
        return newVat;
    }

    public String getBankAccount(){
        String newBank = pro.getProperty("bankAccount");
        return newBank;
    }

    public String getPaymentAmount(){
        String newPaymentAmount = pro.getProperty("paymentAmount");
        return newPaymentAmount;
    }

    public String getDueDate(){
        String newDueDate = pro.getProperty("dueDate");
        return newDueDate;
    }

    public String getdesc(){
        String newDesc = pro.getProperty("description");
        return newDesc;
    }

}