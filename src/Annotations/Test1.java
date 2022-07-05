package Annotations;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
  @AfterTest
  public void add()
  {
	  System.out.println("After Test");
	  System.out.println("Addition");
  }
  @Test(groups = "smoke")
  public void sub()
  {
	  System.out.println("Before suite");
	  System.out.println("sub");
	//  Assert.assertTrue(false);
  }
  @Test
  public void mul()
  {
	  
	  System.out.println("mul");
  }
  @BeforeSuite
  public void div()
  {
	  System.out.println("div");
  }
  
}
