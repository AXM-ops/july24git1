package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void google()
	{
		
		 driver.findElement(By.xpath("")).sendKeys("books",Keys.ENTER);
		
	}

}
