package testCases;


import org.example.PageObjects.Login;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.XLUtils.XLUtils;


import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class LoginTDD extends BasePage {
    @Test(dataProvider = "LoginData")
    public void logintdd(String user, String pwd, String Status) throws InterruptedException {
        Login lp = new Login(driver);
        lp.setEmail(user);
        lp.setPassword(pwd);
        lp.clickLogin();
        Thread.sleep(3000);
        String toast = lp.setSuccessMessage();


        if (toast.contains("Successful")){
            System.out.println("Login Passed:c" +toast);
           driver.navigate().refresh();
           Assert.assertTrue(true);
        }else{
            System.out.println("Login failed: " +toast);
            driver.navigate().refresh();
            Assert.assertEquals(true,false);

        }

    }

    @DataProvider(name="LoginData")
    String [][] getData() throws IOException
    {
        String path= "D:\\New folder\\IdeaProjects\\quickStepsProject\\src\\main\\java\\org\\example\\testData\\Book1.xlsx";

        int rownum=XLUtils.getRowCount(path, "Sheet1");
        int colcount=XLUtils.getCellCount(path,"Sheet1",1);

        String logindata[][]=new String[rownum][colcount];

        for(int i=1;i<=rownum;i++)
        {
            for(int j=0;j<colcount;j++)
            {
                logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
            }

        }
        return logindata;
    }
}

