package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbtest
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void testlogin()
	{
		Fblogintest ob = new Fblogintest(driver);
		ob.setvalue("bv@gmail.com","adsf");
		ob.login();
		//Fbcreatepage ob=new Fbcreatepage(driver);
	}

}
