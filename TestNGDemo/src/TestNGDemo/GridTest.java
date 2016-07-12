package TestNGDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest  {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			DesiredCapabilities caps = DesiredCapabilities.firefox();
		URL url1 = new URL("http://10.34.130.109:5555/wd/hub");
		//URL url = new URL("http://localhost:4444/wd/hub");
		//URL url1 = new URL("http://10.34.130.99:4444/wd/hub");
			RemoteWebDriver driver = new RemoteWebDriver(url1, caps);
				driver.get("http://www.google.com");
				System.out.println(driver.getSessionId());
				//RemoteWebDriver driver1 = new RemoteWebDriver(url, caps);
				//driver1.get("http://www.google.com");
				
		
	}

	


	

};
