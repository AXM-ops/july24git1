package JUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifff2
{
	ChromeDriver driver;
	@Before
    public void rediff() 
    {
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.manage().window().maximize();
}
	@Test
	public void buttonn()
	{
		driver.get
	}
}
