package testCases;

import com.aventstack.extentreports.ExtentReports;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BasePage {

    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getURL();
    public String Username = "TestNewUser";
    public String Email = "yda10839@zbock.com";
    public String Password = "Abcd1234..";
    public String Email1 = readConfig.getLoginEmail();
    public String Password1 = readConfig.getLoginPassword();
    public String companyName = readConfig.getCompanyName();
    public String companyTINField = readConfig.getCompanyTINField();
    public String companyVATField = readConfig.getCompanyVATField();
    public String designation1 = readConfig.getDesignation();
    public String firstName = readConfig.getFirstName();
    public String lastName = readConfig.getLastName();
    public String companyPhoneField = readConfig.getCompanyPhoneField();
    public String companyFaxField = readConfig.getCompanyFaxField();
    public String companyMobileField = readConfig.getCompanyMobileField();
    public String companyEmail = readConfig.getCompanyEmail();
    public String additionalDesignation = readConfig.getAddtionalDesignation();
    public String additionalFirstName = readConfig.getadditionalFirstName();
    public String additionalLastName = readConfig.getadditionalLastName();
    public String additionalPhoneNo = readConfig.getadditionalPhoneNo();
    public String additionalFaxNumber = readConfig.getadditionalFaxNumber();
    public String additionalMobileNumber = readConfig.getadditionalMobile();
    public String additionalEmail = readConfig.getadditionalEmail();
    public String Dep = readConfig.getDep();
    public String address = readConfig.getAddress();
    public String streetNo = readConfig.getStreet();
    public String addressSupplement = readConfig.getAddressSupplement();
    public String postalCode = readConfig.getPostalCode();
    public String AdditionalAddress = readConfig.getadditionalAddress();

    public String AdditionalAddressSupplementNo = readConfig.getAdditionalAddressSupplement();

    public String AdditionalStreetNo = readConfig.getAdditionalStreet();
    public String AdditionalPostalCode = "45577";


    public String enterPriceGroupName = readConfig.getpriceGroup();
    public String enterDiscountGroupName = readConfig.getdiscountGoup();
    public String companyNameField = readConfig.getCompanyNameField();
    public String companyEmailField = readConfig.getCompanyEmailField();




    public String companyUrl = readConfig.getCompanyUrlField();
    public String companyNameCompanyAddress = readConfig.getCompanyNameDetail();
    public String companyAddressCompanyAddresses = readConfig.getAddress_CompanyAddress();

    public String firstname1 = readConfig.getadd_firstName();

    public String lastname1 = readConfig.getadd_lastName();

    public String address1 = readConfig.getadd_address();

    public String iban1 = readConfig.getiban();

    public String accountHolderName = readConfig.getaccountOwneraName();

    public String bicBank = readConfig.getBic();

    public String mendateReferenceNumber = readConfig.getMendate();

    public String mandateDATE = readConfig.getMandateGenerate();

    public String discountAMOUNT = readConfig.getDiscountAmount();

    public String discountCASH = readConfig.getDiscountCash();
    public String productNameField = "Product 1";
    public String productDescrptionField = "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum";
    public String noOfPieceField = "23";
    public String manufactureField = "cloth";
    public String positionNoField = "23";
    public String netPriceField = "18.7";
    public String grossPriceField = "19.8";
    public String purchasePriceField = "20.00";
    public String minSellingPrice = "65.9";
    public String tags = "Tag1";

    public String priceField = "20";

    public String discountField = "30";

    public String bodyText1 = readConfig.getBodyText();

    public String textField1 = readConfig.getTextField();

    public String category1 = readConfig.getcategoryName();

    public String cashDiscount1 = readConfig.getCashDiscount();

    public String discountValidityDate1 = readConfig.getDiscountValidityDate();
    public String vatNumer1 = readConfig.getVatNumber();

    public String bankAccount1 = readConfig.getBankAccount();

    public String paymentAmount1 = readConfig.getPaymentAmount();

    public String dueDate1 = readConfig.getDueDate();
    public String desc1 = readConfig.getdesc();
    public static WebDriver driver;

    public static ExtentReports extent;

    public static Logger logger;

  //  public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br) {
        //    driver = new ChromeDriver();
        extent = new ExtentReports();

       // logger = Logger.getLogger("D:\\New folder\\IdeaProjects\\quickStepsProject");
        logger = Logger.getLogger("D:\\New folder\\IdeaProjects\\quickStepsProject");
     //   PropertyConfigurator.configure("src/main/java/logPackage/log4j/log4j.properties");
        BasicConfigurator.configure();

        if (br.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.out.println("driver inialized");
            driver.get("https://stgfront.my-quicksteps.com/login");
            System.out.println("Website Open");
            driver.manage().window().maximize();
        } else if (br.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (br.equals("ie")) {
            driver = new InternetExplorerDriver();
        }
        driver.get(baseURL);

    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");

    }
}