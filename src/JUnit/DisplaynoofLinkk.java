package JUnit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplaynoofLinkk
{
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
    @Test
    public void facebookLinkCount()
    {
    
    	List<WebElement> li=driver.findElements(By.tagName("a"));
    	System.out.println("total no of list="+li.size());
    	for (WebElement link : li)
    	{
            System.out.println("Link Text: " + link.getText());
            System.out.println("Link URL: " + link.getAttribute("href"));

    	
    }
}
}