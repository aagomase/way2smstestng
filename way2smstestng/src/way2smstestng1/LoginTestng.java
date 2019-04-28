package way2smstestng1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestng {
	
	ChromeDriver driver;
  @BeforeMethod
  public void lauch() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver","c:\\Batch241\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		//WebDriverWait w=new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Login to Way2SMS')]a")));
		Thread.sleep(5000);
		driver.manage().window().maximize();
  }
  
   @Test
   public void validateTitle()
   {
		 
	     System.out.println("Launch is sucessful");
	     String str=driver.getTitle();
		 System.out.println(str);
		 if(str.contains("Free SMS"))
		 {
			 Reporter.log("Titletest passed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Reporter.log("Title test failed");
			 Assert.assertTrue(false);
		 }
	   
  }
}
