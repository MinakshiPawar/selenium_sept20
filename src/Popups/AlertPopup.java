package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
				
				driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
				
				Thread.sleep(3000);
				
				Alert alt = driver.switchTo().alert();
				String text = alt.getText();
				System.out.println(text);
				alt.accept();
				
				
	}
	
}
