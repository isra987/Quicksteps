package org.example.PageObjects;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DeliveryNote {
    WebDriver ldriver;
    public DeliveryNote(WebDriver driver) {
        System.out.println("driver value: "+ driver);

        this.ldriver = driver;
        PageFactory.initElements(ldriver, this);
    }

    @FindBy(xpath = "/html/body/div/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/span")
    WebElement clickDocuments;

    @FindBy(xpath = "//span[contains (text(), 'Delivery Notes')]")
    WebElement clickDeliveryNote;

    @FindBy(css = "body > div.dashboard-main > div.content.tw-basis-5\\/6.tw-bg-secondary-gray > div.tw-w-full.tw-bg-\\[\\#FBFBFB\\].tw-px-\\[23px\\].tw-pb-8.tw-pt-3 > div.tw-border-border-gray.tw-mt-4.tw-rounded-\\[10px\\].tw-border-\\[1px\\] > div > div.tab-content > div > div > div.tw-w-full.tw-pb-5 > div.tw-mt-4.tw-flex.tw-w-full.tw-flex-col.tw-items-start.tw-gap-4.tw-bg-white.tw-pb-0 > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td.tw-relative > div > svg > path")
    WebElement clickAction;

    @FindBy(xpath = "//div[contains (text(), 'Scan QR Code')]")
    WebElement clickScanQRCode;


    public void setClickDocuments() {
        clickDocuments.click();
    }

    public void setClickDeliveryNote() {
        clickDeliveryNote.click();
    }

    public void setClickAction(){
        clickAction.click();
    }

    public void setClickScanQRCode(){
        clickScanQRCode.click();
    }

    public void getQRCode() throws NotFoundException, IOException {
      String QRCode =  ldriver.findElement(By.xpath("//html/body/div[4]/div[3]/div/div/div[2]/div/div[3]/img")).getAttribute("src");
      URL url = new URL(QRCode);
      BufferedImage bufferedImage = ImageIO.read(url);
        LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
      Result result =  new MultiFormatReader().decode(binaryBitmap);
        System.out.println(result.getText());
    }


}
