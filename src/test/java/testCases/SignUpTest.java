package testCases;

import com.github.javafaker.Faker;
import org.example.PageObjects.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUpTest extends BasePage{

    SignUpTest(){

    }
/*
    @Test
    public void signUpTest () throws InterruptedException {
        driver.get(baseURL);

        SignUp Sp = new SignUp(driver);
        Sp.setUserName(Username);
        Sp.setEmail(Email);
        Sp.setPassword(Password);
        Sp.setCheckbox();
        Sp.clickSignup();
        Thread.sleep(10000);

        if (driver.getTitle().equals("Check your Mail")) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }
/*

    @Test
    public void signUpTest() throws InterruptedException {

        int number=1;
        SignUp Sp = new SignUp(driver);
        Faker faker = new Faker();

        for (int i = 0; i < 50; i++) {
            String randomEmail = "quickstepstest+"+number+"@gmail.com";
            driver.get(baseURL);
           // Sp.setUserName(generatedUsername);
            Sp.setUserName(faker.name().username());
            //  Sp.setUserName("User0" + i);
            Sp.setEmail(randomEmail);
            Sp.setPassword("Password@123");
            Sp.setCheckbox();
            Sp.clickSignup();
            number++;

            Thread.sleep(10000); // Add a sleep time to avoid overwhelming the server
        }
    }

     */

    @Test
    public void signUpTest1() throws InterruptedException {
        driver.get("https://stgfront.my-quicksteps.com/sign-up");

        for (int i = 0; i < 210; i++) {
            // Generate random email and username

          //  String randomUsername = SignUp.generateRandomUsername();
            String randomEmail = SignUp.generateRandomEmail();


            SignUp Sp = new SignUp(driver);
            Thread.sleep(5000);
        //    Sp.setUserName(randomUsername);
            Sp.setEmail(randomEmail);
            Sp.setPassword(Password);
            Sp.setCheckbox();
            Sp.clickSignup();
            driver.navigate().refresh();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Close the browser
        driver.quit();
        Thread.sleep(5000);
    }
    }


