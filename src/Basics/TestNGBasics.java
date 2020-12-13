package Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGBasics {

	@Test (dataProvider ="getData")
	public void Login(String userName, String Password)
	{
		System.out.println("Hello TestNG - Login Script here");
		System.out.println(userName);
		System.out.println(Password);
	}
	
	@Test(timeOut=3000)
	public void Signup()
	{
		System.out.println("Hello TestNG - Sign up script here");
	}
	
	@Test
	@Parameters({"userName", "password"})
	
	public void viewAdminPage(String uName, String pwd)
	{
		System.out.println("Hello TestNG - viewAdminPage");
		System.out.println("Username: " + uName);
		System.out.println("Password: " + pwd);
	}
	
	@Test(enabled = false)
	public void Logout()
	{
		System.out.println("Hello TestNG - Logout Script");
	}
	
	@Test(dependsOnMethods= {"Login", "viewAdminPage"})
	public void AdduserMethod()
	{
		System.out.println("Hello TestNG - AdduserMethod");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "First User Name";
		data[0][1] = "First password";
		
		data[1][0] = "Second User Name";
		data[1][1] = "Second password";
		
		data[2][0] = "Third User Name";
		data[2][1] = "Third password";
		return data;
	}
	
}
