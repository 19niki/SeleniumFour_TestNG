package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Test5 
{
	
  @Test(dataProvider = "data")
  public void login(String username, String password) 
  {
	  System.out.println(username +":"+  password);
  }
/*
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
    }*/
  @DataProvider
  public Object[][] data()
  {
	  Object[][] data= new Object[2][2];
	  //We are executing 2 sets of the data for login username and pwd
	  
	  //1st set
	  data[0][0] = "Username1";
	  data[0][1] = "password1";
	  
	  //2nd set
	  data[1][0] = "Username2";
	  data[1][1] = "password2";
	  
	return data ;
  }
  
}
