package way2smstestng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependTestng {
  @Test
  public void login() 
  {
	  Assert.assertEquals(12,13);
	  System.out.println("login perform sucessfully");
  }
  @Test(dependsOnMethods= {"login"})
  public void validate()
  {
	  System.out.println("validate perform sucessfully");
  }
  @Test(dependsOnMethods= {"validate"})
  
  public void logout()
  {
	  System.out.println("logut perform sucessfully");
  }
  
  
}
