package Apache;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/");
	}
	@Test
	public void test() throws  Exception
	{
		FileInputStream ob = new FileInputStream("\"C:\\Users\\axm21\\Downloads\\Untitled spreadsheet (4).xlsx\"");
		XSSFWorkbook wb  = new XSSFWorkbook(ob);
		XSSFSheet sh = wb.getSheet("Sheet");
		int r = sh.getLastRowNum();
		for(int i=1;i<=r;i++)
		{
			String email=sh.getRow(i).getCell(0).getStringCellValue();
			String pass=sh.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys(email);
			driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys(pass);
			driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
			driver.navigate().refresh();			
		}
		
	}

}
