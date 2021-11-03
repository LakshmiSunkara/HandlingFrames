 package afpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class handlingInsecurecertandSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Handling SSL and Insure Certificates
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//Belongs to your local browser
		ChromeOptions c = new ChromeOptions();//chrome options used to set for local browser setting
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\Downloads\\chromedriver93.exe");
		WebDriver driver = new ChromeDriver(c);
		

	}

}
