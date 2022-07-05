package Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
  @AfterSuite
  public void cycle() 
  {
	  System.out.println("After suite");
	  System.out.println("Cycle");
  }
  @Test(groups = "smoke")
  public void bike() 
  {
	  System.out.println("bike");
  }
  @Test
  public void car() 
  {
	  
	  System.out.println("car");
	  
  }
  @Test
  public void bus() 
  {
	  System.out.println("bus");
  }
}
