package Demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource
{
    static String baseurl="https://www.google.com";
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Text present");
		}
		else
		{
			System.out.println("not present");
		}
		driver.quit();	

	}

}
