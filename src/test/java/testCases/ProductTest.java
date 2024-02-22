package testCases;

import org.example.PageObjects.Login;
import org.example.PageObjects.OTP;
import org.example.PageObjects.Product;
import org.testng.annotations.Test;

public class ProductTest extends BasePage {
  //  Login lp = new Login(driver);
    //OTP otp = new OTP(driver);
    //Product product = new Product(driver);

    @Test
    public void ProductTest() throws InterruptedException {
        Login lp = new Login(driver);
        OTP otp = new OTP(driver);
        Product product = new Product(driver);
        driver.get(baseURL);
        lp.setEmail(Email1);
        lp.setPassword(Password1);
        lp.clickLogin();
        String str = otp.getOTP();
        System.out.println("OTP code is :" + str);
        otp.setOTP(str);
        otp.clickVerifyOTP();
        product.setClickAdministration();
        logger.info("Clicked on adminitration on side bar");
        product.setClickProduct();
        logger.info("Clicked on products under administrations");
        product.setClickCreateProduct();
        logger.info("Clicked on create");
        product.setProductNameField(productNameField);
        logger.info("entered product name");
        product.setProductDescriptionField(productDescrptionField);
        logger.info("entered description");
        product.setNoOfPieceField(noOfPieceField);
        logger.info("entered no of pieces");
        product.setUnitsField();
        logger.info("Clicked on units input field");
        product.setDataUnitsField();
        logger.info("Clicked on dropdown to get data");
        product.setManufactureField(manufactureField);
        logger.info("entered munafacturer name");
        product.setPositionNoField(positionNoField);
        logger.info("entered position no");
        product.setNetPriceField(netPriceField);
        logger.info("entered net price");
        product.setGrossPriceField(grossPriceField);
        logger.info("entered gross price");
        product.setPurchasePriceField(purchasePriceField);
        logger.info("entered purchase peice");
        product.setMinSellingPrice(minSellingPrice);
        logger.info("entered min selling price");
        product.setCategory();
        logger.info("clicked on category field");
        product.setClickCategoryFirstElement();
        product.setClickCategorySecondElement();
        logger.info("Category selected");
        product.setTaxRate();
        logger.info("Clicked on tax rate field");
        product.setDataTaxRateField();
        logger.info("Selected data from dropdown");
        product.clicktags(tags);
        logger.info("Tag entered");
        product.setClickAddPriceGroup();
        product.setPriceField(priceField);
        logger.info("price group selected");
        product.setClickAddDiscountGroup();
        product.setDiscountField(discountField);
        logger.info("discount group selected");
        Thread.sleep(5000);
        product.setSaveButton();
        logger.info("Product created successfully");

    }
}
