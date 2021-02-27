package Action_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toGetRating {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if(closebutton.isDisplayed()){
			closebutton.click();
		}
		
		
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi");
String exp="Redmi 9";

List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));

	for (WebElement ele : alloptions) {
		String act=ele.getText();
		if(act.equals(exp)) {
		ele.click();
		break;
	}
	}
//		WebElement Rating = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span/span/span)[1]"));
//		Rating.click();
}
}