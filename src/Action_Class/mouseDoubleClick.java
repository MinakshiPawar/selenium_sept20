package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseDoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
	Thread.sleep(2000);
	Actions act= new Actions(driver);
	act.doubleClick(ele).perform();
}
	
	
}
