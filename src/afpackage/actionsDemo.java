package afpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\Downloads\\chromedriver93.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		// created Action class with object, in Actions class argument we need to pass
		// driver object,so driver will get the capability of actions class methods
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		
		// By using build method, it builds the step and ready to execute, by using
		// .perform it will execute the code
		
		//giving input in Capital letters by using selenium, we are giving capital letter by long pressing the shift key and also see double clicking the given text
		 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		 a.moveToElement(move).contextClick().build().perform();//context click used for right click 
	}
	

}
