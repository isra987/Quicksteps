package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

 public class Reporting extends TestListenerAdapter
{
     public ExtentHtmlReporter htmlReporter;
     public ExtentReports extent;
     public ExtentTest logger;

     public void onStart(ITestContext testContext)
     {
         String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
         String repName = "Test-Report-" +timeStamp+ ".html";
         htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
         htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");

         extent = new ExtentReports();

         extent.attachReporter(htmlReporter);
         extent.setSystemInfo("Host name" , "staging");
         extent.setSystemInfo("Environment" , "QA");
         extent.setSystemInfo("user", "isra");

         htmlReporter.config().setDocumentTitle("quickStepsProject");
         htmlReporter.config().setReportName("Functional Test Report");
         htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
         htmlReporter.config().setTheme(Theme.DARK);
     }

  /*   public void onTestSuccess(ITestResult tr){
         logger=extent.createTest(tr.getTestName());
         logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
     }
     */

    public void onTestSuccess(ITestResult tr) {
        String testName = tr.getTestName();
        if (testName == null || testName.isEmpty()) {
            testName = "DefaultTestName"; // Provide a fallback test name
        }
        logger = extent.createTest(testName);
        logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
    }
     public void onTestFailure(ITestResult tr){
         logger=extent.createTest(tr.getName());
         logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));

         String screenshotPath = System.getProperty("user.dir")+"\\screenshot\\"+tr.getName()+".png";

         File f = new File(screenshotPath);

         if (f.exists())
         {
             try{
                 logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
             }
             catch (Exception e){
                 e.printStackTrace();
             }
         }
     }
     public void onTestSkipped(ITestResult tr){
         logger=extent.createTest(tr.getName());
         logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
     }


        }
