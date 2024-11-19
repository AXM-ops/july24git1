package maven;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class POMdp 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://santamonicaedu.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String exp="Santamonica Study Abroad Pvt. Ltd. | Education Consultants";
		//Assert.assertEquals(actualtitle,exp);
	}

}
