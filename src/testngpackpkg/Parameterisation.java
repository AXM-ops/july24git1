package testngpackpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation 
{
	@Parameters({"s",""})
	@Test
    public void test(String s)
    {
		System.out.println(s);
    }
}
