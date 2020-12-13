package Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics2 {
//@BeforeClass
public void Bforeclass()
{
	System.out.println("Hello TestNG - Before class method");	
}
	
@Test(groups= {"smoke"})
	public void demo21()
	{
		System.out.println("Hello TestNG - 21 JAVA file - Smoke Test Script");
	}

//@Test
public void demo22()
{
	System.out.println("Hello TestNG - 22 JAVA file");
}


//@AfterClass
public void demo23()
{
	System.out.println("Hello TestNG - After class method - 23 JAVA file");
}

//@BeforeTest
public void demo24()
{
	System.out.println("Hello TestNG - 24 JAVA file - Before Test annoation");
}

@Test
public void demo25()
{
	System.out.println("Hello TestNG - 25 JAVA file");
}

}
