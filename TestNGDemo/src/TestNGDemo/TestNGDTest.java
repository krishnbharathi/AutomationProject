package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGDTest {

  @Test
  public void f() {
	 // System.setProperty("webdriver.chrome.driver","C://Users//BEaswara//Desktop//PersonalDocs//selenium//selenium//chromedriver_win32_1//chromedriver.exe");
	 // WebDriver driver = new ChromeDriver();
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     System.out.println(driver.getTitle());
     System.out.println("Success");
    
  }

  @Test
  public void f1() {
 System.out.println("Done");
  }
  
  
}

