package org.example.PageObjects;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OfferCreate {
    WebDriver ldriver;
    WebDriverWait wait;

    public OfferCreate(WebDriver driver) {
        System.out.println("driver value: " + driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Documents')]")
    WebElement documents;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div[1]/div[2]/div/div/div/div/ul/a[1]/div/span")
    WebElement Offer;

    @FindBy(xpath = "//a[@class='btn-primary-blue tw-flex tw-h-[40px] tw-items-center tw-gap-1 tw-rounded-md tw-border-none tw-p-3 tw-text-sm tw-font-medium']")
    WebElement Create;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div")
    WebElement SelectOffer;

    @FindBy(xpath = "//input[@id=':r5:']")
    WebElement clickAddressLabel;

    @FindBy(id = ":r7:")
    WebElement clickContactPerson;

    @FindBy(xpath = "//button[@type='submit']/parent::div[@class='next-button']")
    WebElement clickSaveAndNext;

    @FindBy(xpath = ".//button[@class='MuiButtonBase-root MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium btn tw-font-dm  btn-secondary tw-text-sm  css-5bcq5j']")
    WebElement clickBodyText;

    @FindBy(xpath = "//input[@placeholder='Enter Title']")
    WebElement bodyText;

    @FindBy(id = "tinymce")
    WebElement textField;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium MuiButton-root MuiButton-Primary MuiButton-sizeMedium MuiButton-SizeMedium btn tw-font-dm  btn-primary tw-px-6 tw-py-2 tw-text-sm tw-font-semibold tw-leading-[16.94px] css-5bcq5j']")
    WebElement add;

    public void clickDocuments() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Documents')]")));
        documents.click();
    }

    public void clickOffer() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[1]/div[2]/div/div/div/div/ul/a[1]/div/span")));
        Offer.click();
    }

    public void clickCreate() {
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/.//a[@class='btn-primary-blue tw-flex tw-h-[40px] tw-items-center tw-gap-1 tw-rounded-md tw-border-none tw-p-3 tw-text-sm tw-font-medium']")));
        Create.click();
    }

    public void select() {
        SelectOffer.click();
    }

    public void clickSelectOffer() throws InterruptedException {
        WebElement element = ldriver.findElement(By.cssSelector("div[role=\"presentation\"]"));
        Thread.sleep(5000);
        String innerHTML = element.getAttribute("innerHTML");
        System.out.println("html list is  " + innerHTML);

        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[3]/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div")));
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-option-index='1']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("Isra Aslam")) {
                ele.click();
                break;
            }
        }
    }

    public void setClickAddressLabel() throws InterruptedException {
        clickAddressLabel.click();
        WebElement element = ldriver.findElement(By.cssSelector("div[role=\"presentation\"]"));
        Thread.sleep(5000);
        String innerHTML = element.getAttribute("innerHTML");
        System.out.println("html list of address label is  " + innerHTML);

       WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':r5:']")));
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-option-index='0']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("Zapta")) {
                ele.click();
                break;
            }
        }
    }

    public void setClickContactPerson() throws InterruptedException {
        clickContactPerson.click();
        WebElement element = ldriver.findElement(By.cssSelector("div[role=\"presentation\"]"));
        Thread.sleep(5000);
        String innerHTML = element.getAttribute("innerHTML");
        System.out.println("html list of contact person is  " + innerHTML);

        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( ":r7:")));
        List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-option-index='0']"));
        for (WebElement ele : optionDiscount) {
            String text1 = ele.getText();
            if (text1.contains("Harim Lahoreddddd")) {
                ele.click();
                break;
            }
        }
    }

    public void setClickSaveAndNext() throws InterruptedException {
        clickSaveAndNext.click();
        Thread.sleep(5000);
    }

    public void setClickBodyText(){
        clickBodyText.click();
    }

    public void setBodyText(String enterBodytext){
        bodyText.sendKeys(enterBodytext);
    }


    public void setTextField1(String enterTextField){
        WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[@class='tox tox-tinymce']")));
        ldriver.switchTo().frame(0);
        System.out.println("entered");
        textField.sendKeys(enterTextField);
    }

    public void setAdd(){
      //  WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(5000));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[2]/div[3]/div/div/div[2]/div/div[4]/div[2]/button[2]")));
        add.click();
    }

}


