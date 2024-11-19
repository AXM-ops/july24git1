package testngpackpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("demo.guru99.com");
		
	}
	@Test
	public void main() throws IOException, Exception
	{
		 driver.findElement(By.xpath(null)).sendKeys();//button
		 driver.findElement(By.xpath(null)).sendKeys();
		 
		 
	
	}

}
