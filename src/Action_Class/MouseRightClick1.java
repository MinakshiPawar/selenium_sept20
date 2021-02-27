package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	if(closeButton.isDisplayed()) {
		closeButton.click();
	}
	
	WebElement morebutton = driver.findElement(By.xpath("//div[@class='exehdJ']"));
	
	Actions act=new Actions(driver);
	//act.moveToElement(morebutton).contextClick().build().perform();

act.contextClick(morebutton).perform();

}
	}
