package way2smstestng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginway2sms {
	
	ChromeDriver driver;
 // @Test
  public void Launch() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","c:\\Batch241\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		//WebDriverWait w=new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Login to Way2SMS')]a")));
		Thread.sleep(5000);
		driver.manage().window().maximize();
  }
  //@Test
  
  
}
