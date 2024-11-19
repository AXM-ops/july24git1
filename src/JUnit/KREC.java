package JUnit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class KREC {

		ChromeDriver driver;
		@Before
		public void Kerala()
		{
			driver=new ChromeDriver();
			driver.get("https://keralaproperty.in/member/login/");
		}
		@Test
		public void KREClogin()
		{
			//driver.findElements(By.id("ulogin"))
			//driver.findElements(By.name("upass")).sendKeys("sdfghmdty");
			//driver.findElements(By.id("sub_logbtn")).click();
	}
}

