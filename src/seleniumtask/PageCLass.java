package seleniumtask;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCLass 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement uname;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"login-button\"]")
	WebElement login;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/button")
	List <WebElement> cart;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartbtn;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"first-name\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"last-name\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"postal-code\"]")
	WebElement zip;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	WebElement cont;
	
	@FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
	WebElement ham;
	
	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logout;
	
	
	
	public void pageclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void test1(String username,String pwd)
	{
		uname.sendKeys(username);
		password.sendKeys(pwd);
		
	}
	public void logintest()
	{
		login.click();
	}
	
	public void cart()
	{
		for(WebElement v:cart)
		{
			v.click();
		}
	}
	public void cart1() 
	{
		cartbtn.click();
		checkout.click();
	}
	
	public void field(String user,String lass,String zipcode)
	{
		firstname.sendKeys(user);
		lastname.sendKeys(lass);
		zip.sendKeys(zipcode);
		cont.click();
	}
	
	public void sigout() 
	{
		ham.click();
		
	}
	
	public void last()
	{
		logout.click();
	}

}
