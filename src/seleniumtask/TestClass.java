package seleniumtask;

import org.testng.annotations.Test;

import utilities.xlutilities;

public class TestClass extends BaseClass
{
	@Test
	public void saucetest() throws Exception
	{
		PageCLass ob=new PageCLass();
		String xl="F:\\Jithin jose\\book2.xlsx";
		String sheet="Sheet1";


		int rowCount =xlutilities.getrRowCount(xl, sheet);

		for(int i=1;i<=rowCount;i++)
		{
			String username=xlutilities.getCellValue(xl, sheet, i, 0);
			System.out.println("username--->"+username);
			String pwd=xlutilities.getCellValue(xl, sheet, i, 1);
			System.out.println("password--->"+pwd);
			
			ob.test1(username, pwd);
			ob.logintest();
			driver.navigate().refresh();
			
				
	}
		ob.cart();
		ob.cart1();
		ob.field("jithin", "jose", "695564");
		ob.sigout();
		Thread.sleep(1000);
		ob.last();
	}


}
