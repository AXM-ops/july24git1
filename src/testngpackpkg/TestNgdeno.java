package testngpackpkg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestNgdeno 
{
	@BeforeTest(alwaysRun = true)
	public void setup()
	{
		System.out.println("beforetest,browser open");
	}
	@BeforeMethod(alwaysRun = true)
	public void mthd()
	{
		System.out.println("url loading");
	}
	@Test(priority = 2,invocationCount = 3,dependsOnMethods = {"test2"},groups = "sanity")//innvocation = 3 - executing 3 times, dependsOnMethod for testing 1st
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 4,groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 1,enabled = false)//for skip a method
	public void test3() 
	{
		System.out.println("test3");
	}
	@Test(priority = 3,groups = {"regression"})
	public void test4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void aftmthd()
	{
		System.out.println("After Method");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("After Test");
	}
}
//priority
//invocationCount
//dependsOnMethods
//groups

//.@beforesuite
//.@beforetest
//.@beforeclass
//.@beforemethod
//.@test
//.@aftermethod
//.@afterclass
//.@aftertest
//.@aftersuit