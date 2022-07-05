package Annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void football() 
  {
	  System.out.println("football");
  }
  @BeforeMethod
  public void crickect() 
  {   
	  System.out.println("Before Method");
	  System.out.println("crickect");
	  
  }
  @Test(groups = "smoke")
  public void basketball() 
  {
	  
	  System.out.println("basketball");
  }
  @BeforeTest
  public void baseball() 
  {
	  System.out.println("Before Test");
	  System.out.println("baseball");
  }
}
