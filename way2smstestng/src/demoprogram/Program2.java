package demoprogram;

import org.testng.annotations.Test;

public class Program2 {
	
	@Test
	public void inner()
	{
		System.out.println("i am in inner class");
	}
	
	@Test
	public void outer()
	{
		System.out.println("I am in outer class");
	}

}
