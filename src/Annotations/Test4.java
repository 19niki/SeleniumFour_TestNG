package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Test4 {
	
	
	@Parameters({"Baseurl","username"})
	@Test
	public void before(String urlName, String username)
	{
		
		System.out.println(urlName);
		System.out.println(username);
	}
	
	@AfterClass
	public void after()
	{
		System.out.println("After class");
	}
  @AfterMethod
  public void Puc() 
  {
	  System.out.println("After Method");
  }
  @Test (groups = "smoke")
  public void Degree()
  {
	  System.out.println("BCA");  
  }
  @Test
  public void Master()
  {
	  System.out.println("MCA");
  }
}
