package demoprogram;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Program1 {

	@Test
	public void login()
	{
		System.out.println("I am in Facebook Login");
		Assert.assertEquals(12,13);
	}
	
	@Test(dependsOnMethods="login")
	public void action()
	{
		System.out.println("I am in actions");
	}
	
	@Test(dependsOnMethods="action")
	public void logout()
	{
		System.out.println("i am performing logout");
	}
}
