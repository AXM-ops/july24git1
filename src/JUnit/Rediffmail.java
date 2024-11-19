package JUnit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void rediffmail()
	{
		List<WebElement> li=driver.findElements(By.name("a"));
		System.out.println("total no of list="+li.size());
		for (WebElement cnt : li)
		{
			if(li.size()==30)
			{
				System.out.println("verified");
			}
			else
			{
				System.out.println("not verified");	
			}
		}
	}
	@Test
	public void links()
	{
		String src=driver.getPageSource();
		String expectedtitle="Create a Rediffmail account";
		if(src.contains(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}









