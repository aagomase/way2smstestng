package way2smstestng1;

import org.testng.annotations.Test;

public class Sample1 {
  @Test(groups= {"sanity-group"})
  public void show() 
  {
	  System.out.println("I am in TestNG");
	  
  }
  
  @Test(groups={"sanity-group"})
  public void show1() 
  {
	  System.out.println("I am in show2");
	  
  }
  
  @Test(groups={"regression"})
  public void show2() 
  {
	  System.out.println("I am in show3");
	  
  }
}
