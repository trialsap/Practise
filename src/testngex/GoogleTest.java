package testngex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
  @Test
  public void verifyTitle() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	  System.out.println(driver.getTitle());
	 
  }
  @Test
  public void f()
  {
	  System.out.println("f");
  }
  
}
