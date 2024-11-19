package jar;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport
{
    WebDriver driver;
    String baseurl = "https://www.facebook.com/";
    ExtentSparkReporter reporter;
    ExtentTest test;
    ExtentReports extent;

    @BeforeTest
    public void beftest() 
    {
        extent = new ExtentReports(); // Initialize ExtentReports
        reporter = new ExtentSparkReporter("./Reports/myreport.html");
        reporter.config().setDocumentTitle("Automation Report");
        reporter.config().setReportName("Functional Test");
        reporter.config().setTheme(Theme.DARK);
        extent.attachReporter(reporter);
        extent.setSystemInfo("hostname", "localhost");
        extent.setSystemInfo("os", "Windows 11");
        extent.setSystemInfo("testername", "Azim");
        extent.setSystemInfo("Browser name", "Chrome");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setUp()
    {
        driver.get(baseurl);
    }

    @Test
    public void fbtitleverification()
    {
        test = extent.createTest("fbtitleverification");
        String expected = "facebook";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void browserClose(ITestResult result) throws IOException
    {
        if (result.getStatus() == ITestResult.FAILURE) 
        {
            test.log(Status.FAIL, "Test case failed: " + result.getName());
            test.log(Status.FAIL, "Cause: " + result.getThrowable());
            String screenshotPath = takeScreenshot(driver, result.getName());
            test.addScreenCaptureFromPath(screenshotPath);
        } 
        else if (result.getStatus() == ITestResult.SKIP) 
        {
            test.log(Status.SKIP, "Test case skipped: " + result.getName());
        } 
        else if (result.getStatus() == ITestResult.SUCCESS) 
        {
            test.log(Status.PASS, "Test case passed: " + result.getName());
        }
        driver.quit(); // Ensure the browser is closed
    }

    @AfterTest
    public void teardown() 
    {
        extent.flush();
    }

    public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException 
    {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = "./Screenshots/" + screenshotName + ".jpeg";
        FileHandler.copy(src, new File(destination));
        return destination;
    }
}
