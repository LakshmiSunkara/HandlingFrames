package afpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\Downloads\\chromedriver93.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//To find how many frames are present in web page by using below step we can identify
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);// first way
		//we need to tell Selenium that web page is in frames so that it will identify the element accordingly
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));//second way
		Actions a = new Actions(driver);
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Target).build().perform();
		driver.switchTo().defaultContent();//to switch back normal content from frames

	}

}
