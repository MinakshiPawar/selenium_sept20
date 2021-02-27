package Multilink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTotalCountOfWebPages {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		
		 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		 System.out.println(allLinks.size());
		 
		 for (WebElement ele : allLinks) {
			System.out.println(ele.getText());
		}

		
	}
	
}
