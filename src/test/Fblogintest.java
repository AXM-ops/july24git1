package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogintest
{
	WebDriver driver;
	By fbemail = By.id("email");
	By fbpassword = By.id("pass");
	By fblogin = By.id("login");
	public Fblogintest(WebDriver driver)
	{
		this.driver = driver;
	}
	public void setvalue(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}
	
}
