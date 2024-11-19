package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox
{
	ChromeDriver driver;
	@Before
	public void seUp()
	{
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/axm21/OneDrive/Documents/.html");			
	}
	@Test
	public void htmlpage()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println("alert text="+text);
		a.accept();
		//a.dismiss(); //to cancel alert
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Aazim");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ymn");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
