package Apache;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago
{
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
	}
	@Test
	public void trivagoo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div/div[2]/div/div/button[1]/span")).click();
		datepickerMethod1("December 2024","3");
	    //datepickerMethod2("January 2025","4");
	}
	private void datepickerMethod1(String expmonth, String expdate) 
	{
		while(true)
		{
			String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
			System.out.println("month="+expmonth);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg/path")).click();
			}
		}
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/table/tbody/tr/td/span"));
		for(WebElement d:date)
		{
			String datetext = d.getText();
			if(datetext.equals(expdate));
			{
				d.click();
				break;
		}
		}
		
	}
}
