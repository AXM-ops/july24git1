package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropfield 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void drop()
	{
		WebElement day = driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select ob=new Select(day);
		ob.selectByValue("05");
		
		WebElement month = driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select ob1=new Select(month);
		ob.selectByValue("march");
		
		WebElement year = driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select ob2=new Select(year);
		ob.selectByValue("2000");
	}
	@Test
	public void butn() 
	{
		String buttontext=driver.findElement(By.xpath("*//[@id='']")).getAttribute("value");
		System.out.println("buttontext");
		if(buttontext.equals("check availability"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
	}
}
