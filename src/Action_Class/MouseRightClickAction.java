package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//To handle close button
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(closeButton.isDisplayed())
		{
			closeButton.click();
		}
		
		Thread.sleep(2000);
				
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	
		
		Actions act=new Actions(driver);
		act.contextClick(login).perform();
		

}}