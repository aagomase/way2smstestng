package way2smstestng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
  @Test(priority=1)
  public void test1() 
  {
	  
	  System.out.println("i am in test1");
  }
  
  @Test(enabled=false)
  public void test2() 
  {
	  
	  System.out.println("i am in test2");
  }
  
  @Test(priority=2)
  public void test3() 
  {
	  
	  System.out.println("i am in test1");
  }
  
  @Test(priority=3)
  public void test4()
  {
	  Assert.assertTrue(true);
	  System.out.println("i am in test1");
  }
}
