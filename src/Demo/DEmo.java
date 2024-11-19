package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class DEmo 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	}
}
//ChromeDriver
//Edgedriver
//Firefoxdriver