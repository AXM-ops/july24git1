package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Fbloginpage
{
   

    @FindBy(id = "email")
    WebElement fbemail;
    
    @FindBy(id = "pass")
    WebElement fbpassword;
    
    @FindBy(name = "login")
    WebElement fblogin;

    public Fbloginpage(WebDriver driver)
    {
     //this.driver=driver;
        
        PageFactory.initElements(driver, this);
    }

    public void setValues(String email, String password)
    {
       
        fbemail.sendKeys(email);
        
       
        fbpassword.sendKeys(password);
    }

    public void login()
    {
       fblogin.clear();
    }
}
