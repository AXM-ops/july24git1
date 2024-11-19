package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Glanza 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.virustotal.com");
		String actualtitle=driver.getTitle();
		String expectedtitle="VirusTotal - Home";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		String src=driver.getPageSource();
		String expectedtitle1="FILE";
		if(src.equals(expectedtitle1))
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
//https://glanza.in/product-category/home/