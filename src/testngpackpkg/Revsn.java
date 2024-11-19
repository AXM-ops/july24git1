package testngpackpkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Revsn 
{
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		System.out.println("beforetest,browser open");
	}
	@BeforeMethod(alwaysRun = true)
	public void mthd()
	{
		System.out.println("www.google.com");
	}
	@Test(priority = 2,groups = {"smoke,sanity"})
	public void test1()
	{
		
	}

}
