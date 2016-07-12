package TestNGDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.html5.RemoteSessionStorage;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.remote.http.*;

public class NewDriver  extends RemoteWebDriver {
	
	NewDriver(java.net.URL remoteAddress, Capabilities desiredCapabilities) {
		super(remoteAddress, desiredCapabilities);
	}
	String opaqueKey;
	SessionId str;
	protected void setSessionId(String str){
	super.setSessionId(str);
		
	}
	
	NewDriver(Capabilities desiredCapabilities){
		super(desiredCapabilities);
	}
	private void NewDriver() {
		// TODO Auto-generated method stub
		
	}

	protected void startSession(Capabilities dcap) {
		super.startSession(dcap);
	}
	
	public String getSessionId1() {
		
	return super.getSessionId().toString();
		
	}
	public void get(java.lang.String url){
		super.get(url);
		
	}
	

	public static void main(String[] args) throws MalformedURLException {

		WebDriver webDriver = null;

		
		String  str1 = "ae129116-541e-4ba4-9b14-d5245900d0a7";
//URL uri = new URL("http://localhost:7055/hub");
DesiredCapabilities capability = new DesiredCapabilities().firefox();
//capability.setCapability("SessionId", str1);
//NewDriver RDri = new NewDriver(capability);
//RDri.startSession(capability);
//RDri.get("http://www.outlook.com");
NewDriver dri= new NewDriver (new URL("http://10.34.130.99:5555/wd/hub"), capability);
//System.out.println(" new  sessopn id " + dri.getSessionId1() +"\n" );
//b7a6fc42-ff0d-4331-a087-dad433276a56
//capability.setCapability("SessionId", str1);

dri.setSessionId(str1);

//URL uri = new URL("http://192.168.1.3:4444");
//RemoteWebDriver Driver = new RemoteWebDriver(new URL("http://192.168.1.4:5555/wd/hub"), capability);

System.out.println(" new  sessopn id " + dri.getSessionId1() +"\n" );
//ebDriver = new RemoteWebDriver(uri, DesiredCapabilities.firefox());
System.out.println("Executed on remote driver");

dri.get("http://www.google.com");

dri.navigate().to("http://www.gmail.com");
System.out.println(dri.getWindowHandle());
//dri1.get("http://www.facebook.com");
//System.out.print("existng id " + dri1.getSessionId1());
//System.out.print(driver1.getSessionId());





}
}
