package JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FAcebook 
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void fblogin()
	{
		driver.getTitle();
		String exp="Google";


	}
@After
public void tearDown()
{
 driver.quit();	
}
}
//name="email" id="email"
//" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">