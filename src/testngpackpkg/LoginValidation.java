package testngpackpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidation 
{

	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		
		
	}
	@Test
	public void main() throws IOException, Exception
	{
		driver.get("https://keralaproperty.in/member/login/");
		driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("mdaazim.lk@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("web2bCp@z6BCgN");
		driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
		Thread.sleep(3000);
		String expurl = "https://keralaproperty.in/member/myhome/";
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
		if(expurl.equals(actualurl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("loigin failed");
		}
	}
}
