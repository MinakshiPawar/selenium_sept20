package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	Actions act= new Actions(driver);
	act.dragAndDrop(source, dest).perform();
	
	}
}