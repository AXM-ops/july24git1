package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void flogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("md@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Aazim@0456456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
