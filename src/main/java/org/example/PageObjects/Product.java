package org.example.PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Product {
    WebDriver ldriver;
    WebDriver wait;

    public Product(WebDriver driver) {
        System.out.println("driver value: "+ driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Administrations')]")
    WebElement clickAdministration;

    @FindBy(xpath = "//span[contains(text(), 'Products')]")
    WebElement clickProduct;

    @FindBy(xpath = ".//a[@type='button']")
    WebElement clickCreateProduct;

    @FindBy(name = "productName")
    WebElement productNameField;

    @FindBy(name = "description")
    WebElement productDescriptionField;

    @FindBy(xpath = "//input[@placeholder='Number Of Piece ']")
    WebElement noOfPieceField;

    @FindBy(id = "mui-component-select-unit")
    WebElement unitsField;

    @FindBy(name = "manufacturer")
    WebElement manufactureField;

    @FindBy(name = "positionNo")
    WebElement positionNoField;

    @FindBy(name = "netPrice")
    WebElement netPriceField;

    @FindBy(name = "grossPrice")
    WebElement grossPriceField;

    @FindBy(name = "purchasePrice")
    WebElement purchasePriceField;

    @FindBy(name = "minSellingPrice")
    WebElement minSellingPrice;

    @FindBy(name = "category")
    WebElement category;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div")
    WebElement clickCategoryFirstElement;

    @FindBy(xpath = "//p[contains (text(), 'category 1')]")
    WebElement clickCategorySecondElement;

    @FindBy(id = "mui-component-select-taxRate")
    WebElement taxRate;

    @FindBy(xpath = "//input[@class='rti--input']")
    WebElement tags;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[4]/div[1]/span")
    WebElement clickAddPriceGroup;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[4]/div[2]/div[1]/form/div[1]/div/div/div")
    WebElement clickPriceGroupName;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[4]/div[2]/div[1]/form/div[2]/div/div/div/input")
    WebElement priceField;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[4]/div[2]/div[2]/button[1]")
    WebElement clickAdd;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[5]/div/span")
    WebElement clickDiscountGroup;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[5]/div[2]/div[1]/form/div[1]/div/div/div")
    WebElement clickDiscountGroupName;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[5]/div[2]/div[1]/form/div[2]/div/div/div/input")
    WebElement discountField;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[2]/div[2]/div[5]/div[2]/div[2]/button[1]")
    WebElement clickAdd1;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/form/div[1]/button")
    WebElement saveButton;

    public void setClickAdministration() {
        clickAdministration.click();
    }

    public void setClickProduct() {
        clickProduct.click();
    }

    public void setClickCreateProduct() {
        clickCreateProduct.click();
    }

    public void setProductNameField(String enterProductName) {
        productNameField.sendKeys(enterProductName);
    }

    public void setProductDescriptionField(String enterProductDescription) {
        productDescriptionField.sendKeys(enterProductDescription);
    }

    public void setNoOfPieceField(String enterNoOfPieces) {
        noOfPieceField.sendKeys(enterNoOfPieces);
    }

    public void setUnitsField() {
        unitsField.click();
    }

    public void setDataUnitsField() {
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value='m']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("m")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }
    }

    public void setManufactureField(String enterManufactureField){
        manufactureField.sendKeys(enterManufactureField);
    }

    public void setPositionNoField(String enterPositionNoField){
        positionNoField.sendKeys(enterPositionNoField);
    }

    public void setNetPriceField(String enterNetPriceField){
        netPriceField.sendKeys(enterNetPriceField);
    }

    public void setGrossPriceField(String enterGrossPriceField){
        grossPriceField.sendKeys(enterGrossPriceField);
    }

    public void setPurchasePriceField(String enterPurchasePriceField){
        purchasePriceField.sendKeys(enterPurchasePriceField);
    }

    public void setMinSellingPrice(String enterMinSellingPrice){
        minSellingPrice.sendKeys(enterMinSellingPrice);
    }

    public void setCategory(){
        category.click();
    }

    public void setClickCategoryFirstElement(){
        clickCategoryFirstElement.click();
    }

    public void setClickCategorySecondElement(){
        clickCategorySecondElement.click();
    }

    public void setTaxRate(){
        taxRate.click();
    }

    public void setDataTaxRateField() {
        List<WebElement> option = ldriver.findElements(By.xpath("//li[@data-value ='5%']"));
        for (WebElement ele : option) {
            String str = ele.getText();
            if (str.contains("5%")) {
                System.out.println(ele.getText());
                ele.click();
                break;
            }
        }
    }

    public void clicktags(String enterTags){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='rti--input']")));
        element.click();
        tags.sendKeys(enterTags);
        tags.sendKeys(Keys.ENTER);

    }

    public void setClickAddPriceGroup(){
        clickAddPriceGroup.click();
        clickPriceGroupName.click();
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-value='51']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("new price group1")) {
                ele.click();
                break;
            }
        }
    }
    public void setPriceField(String enterprice){
        priceField.sendKeys(enterprice);
        clickAdd.click();
    }

    public void setClickAddDiscountGroup(){
        clickDiscountGroup.click();
        clickDiscountGroupName.click();
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-value='51']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("discount group 1")) {
                ele.click();
                break;
            }
        }
    }
    public void setDiscountField(String enterdiscount){
        discountField.sendKeys(enterdiscount);
        clickAdd1.click();
    }

    public void setSaveButton(){
        saveButton.click();
    }


}