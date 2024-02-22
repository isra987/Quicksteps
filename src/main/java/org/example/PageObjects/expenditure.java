package org.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.awt.SystemColor.text;

public class expenditure {

        WebDriver ldriver;
        WebDriverWait wait;

       public expenditure(WebDriver driver) {
        System.out.println("driver value: "+ driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }
        @FindBy(xpath = "//span[contains (text(), 'Expenses')]")
        WebElement expenses;

        @FindBy(xpath = "//span[contains (text(), 'Expenditures')]")
        WebElement expenditure;

        @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div[1]/div/a")
        WebElement createExpenditure;

        @FindBy(xpath = "//input[@id=':Rc4l9mmmba:']")
        WebElement contact;

        @FindBy(xpath = "//input[@placeholder='Select Category']")
        WebElement category;

        @FindBy(id = ":Rc8l9mmmba:-option-0")
        WebElement clickAddCategory;

        @FindBy(name = "categoryName")
        WebElement categoryName;

        @FindBy(css= "body > div.MuiModal-root.MuiDialog-root.\\!tw-rounded-\\[20px\\].css-1xy808x > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div.MuiDialogContent-root.tw-rounded-\\[20px\\].tw-bg-white.css-1ty026z > form > div.tw-mt-6.tw-flex.tw-justify-end.tw-gap-\\[20px\\] > button.MuiButtonBase-root.MuiButton-root.MuiButton-Primary.MuiButton-sizeMedium.MuiButton-SizeMedium.MuiButton-root.MuiButton-Primary.MuiButton-sizeMedium.MuiButton-SizeMedium.btn.tw-font-dm.btn-primary.css-5bcq5j")
        WebElement save;

        @FindBy(name = "cashDiscount")
        WebElement cashDiscount;

        @FindBy(xpath = "//input[@placeholder='Enter Cash Discount Validity Date']")
        WebElement discountValidityDate;

        @FindBy(name = "vatNumber")
        WebElement VatNumber;

        @FindBy(name = "bankAccount")
        WebElement bankAccount;

        @FindBy(name = "paymentAmount")
        WebElement paymentAmount;

        @FindBy(name = "taxRate")
        WebElement taxRate;

        @FindBy(name = "dueDate")
        WebElement dueDate;

        @FindBy(name = "description")
        WebElement description;

        @FindBy(css = "body > div > div.content.tw-basis-5\\/6.tw-bg-secondary-gray > div.tw-mx-6.tw-mb-\\[43px\\].tw-mt-4.tw-rounded-\\[20px\\].tw-border.tw-border-solid.tw-border-disabled-input.tw-bg-white.tw-p-5 > form > div.tw-mt-6.tw-flex.tw-w-full.tw-items-center.tw-justify-end > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-Primary.MuiButton-sizeMedium.MuiButton-SizeMedium.MuiButton-root.MuiButton-Primary.MuiButton-sizeMedium.MuiButton-SizeMedium.btn.tw-font-dm.btn-primary.css-5bcq5j")
        WebElement saveData;
        public void setExpenses(){
        expenses.click();
        }

        public void setExpenditure(){
            expenditure.click();
        }

        public void setCreateExpenditure(){
            createExpenditure.click();
        }

        public void setContact() throws InterruptedException {
            contact.click();
            WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10000));
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("div[role=\"presentation\"]"))));

            WebElement element = ldriver.findElement(By.cssSelector("div[role=\"presentation\"]"));
            //WebElement element =  ldriver.findElement(By.xpath("//div[@role=\"presentation\"]"));
           Thread.sleep(5000);
            String innerHtml = element.getAttribute("innerText");
            System.out.println("inner html is " +innerHtml);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[role=\"presentation\"]")));
            List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-option-index='8']"));
            for (WebElement ele : optionDiscount) {
                String text1 = ele.getText();
                System.out.println(" element get");
                if (text1.contains("Harim Lahore")) {
                    ele.click();
                    Thread.sleep(5000);
                    break;

                }
            }
        }

        public void setCategory(String enterCAtegoryName) throws InterruptedException {

            category.click();
            clickAddCategory.click();
            categoryName.sendKeys(enterCAtegoryName);
            Thread.sleep(5000);
            save.click();

        }

        public void selectCategory() throws InterruptedException {
            category.click();
            WebElement element = ldriver.findElement(By.cssSelector("div[role=\"presentation\"]"));
            Thread.sleep(5000);
            String innerHtml = element.getAttribute("innerText");
            System.out.println("inner html is " +innerHtml);

            List<WebElement> optionDiscount = ldriver.findElements(By.xpath("//li[@data-option-index='4']"));
           for (WebElement ele : optionDiscount) {
                String text1 = ele.getText();
                System.out.println(" element get");
                if (text1.contains("Eraser")) {
                    ele.click();
                    Thread.sleep(5000);
                    break;

                }
            }
        }

       public void setCashDiscount(String enterCashDiscount){
            cashDiscount.sendKeys(enterCashDiscount);
       }

       public void setDiscountValidityDate(String enterDiscountValidityDate){
            discountValidityDate.click();
            discountValidityDate.sendKeys(enterDiscountValidityDate);
       }

       public void setVatNumber(String enterVatNumber){
            VatNumber.sendKeys(enterVatNumber);
       }

       public void setBankAccount(String enterBankAccount){
            VatNumber.sendKeys(enterBankAccount);
       }

       public void setPaymentAmount(String enterPaymentAmount){
            paymentAmount.sendKeys(enterPaymentAmount);
       }

       public void setTaxRate(){
            taxRate.click();

            List <WebElement> elements = ldriver.findElements(By.xpath("//div[@role='presentation']"));
            for (WebElement ele : elements){
                String text = ele.getText();
                if (text.contains("19:00")){
                    ele.click();
                    break;
            }
       }
        }

        public void setDueDate(String enterDueDate){
            dueDate.click();
            dueDate.sendKeys(enterDueDate);
        }

        public void setDescription(String enterDesc){
            description .sendKeys(enterDesc);
        }

        public void setSave(){
            saveData.click();
        }
        }




