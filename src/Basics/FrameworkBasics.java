package Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FrameworkBasics {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	//@BeforeMethod
@Test
@Parameters({"URL"})
	public void demo1(String urlName)
{
	System.out.println("Hello TestNG -- URL will be printed -  Before Every method");
	System.out.println(urlName);
}

	@Test(groups= {"smoke"})
	public void demo2()
	{
		System.out.println("Hello TestNG demo 2 - Smoke testing script");
	}
	
	//@AfterMethod
	public void demo3()
	{
		System.out.println("Hello TestNG demo 3 --- After Method");
	}
	
	@Test
	public void demo4()
	{
		System.out.println("Hello TestNG demo 4");}
	
}
