package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs
{
	ChromeDriver driver;
	@Before
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void loginpage()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Aazim");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Y M");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("628551");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
	}
}
