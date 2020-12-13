package Basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test26NOV {
	
	//@BeforeSuite
	public void MobileLogin()
	{
		System.out.println("Mobile Login - Before Test suite");
	}

		@Test(groups= {"smoke"})
		public void MobileSignin()
		{
			System.out.println("Mobile Signin - Smoke Tesing Script");
		}
		
		//@AfterSuite
		public void MobileSignup()
		{
			System.out.println("Mobile Signup - After Test Suite");
		}
		
		//@AfterTest
		public void WebLogin()
		{
			System.out.println("Web Login - After Test");
		}
		
	}


