package utilities;

import org.testng.annotations.Test;

public class FBlogintest extends fbloginbase
{

@Test
	public void verifylogin() throws Exception
	{
		
	
fbloginpage ob=new fbloginpage(driver);

String xl="F:\\Jithin jose\\book1.xlsx";
String sheet="Sheet1";


int rowCount =xlutilities.getrRowCount(xl, sheet);

for(int i=1;i<=rowCount;i++)
{
	String username=xlutilities.getCellValue(xl, sheet, i, 0);
	System.out.println("username--->"+username);
	String pwd=xlutilities.getCellValue(xl, sheet, i, 1);
	System.out.println("password--->"+pwd);
	//p1.setvalues(UserName, Pwd);
	//p1.clickLoginBtn();
}	
}	
}