package WebTable;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Row_Count {



		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Lenovo/Selenium/HTML/Sample2.html");
		int tableRowSize=driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
		System.out.println("Total no of rows in the table:"+ tableRowSize);
		
	}
	
	
}
