package testngpackpkg;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserTesng 
{ 
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
		 driver = new ChromeDriver();	
	    }
		else if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new SafariDriver();
		}
	}
		@Test
	public void test()
	{
		driver.get("https://www.google.com");
	}

}
