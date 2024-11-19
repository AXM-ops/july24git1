package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createloginpage
{
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[4]/div[3]/a")
	WebElement create;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[1]/div[1]")
	WebElement createanew;


}
