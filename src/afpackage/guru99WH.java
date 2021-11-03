package afpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99WH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\Downloads\\chromedriver93.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		//Switching to alert
		Alert alert = driver.switchTo().alert();
		//capturing alert message
		String alertMessage = driver.switchTo().alert().getText();
		//displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(5000);
		alert.accept();
		
		

	}

}
