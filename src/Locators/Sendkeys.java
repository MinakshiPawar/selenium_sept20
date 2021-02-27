package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

//public static void main(String[] args) throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();	
//		
//		//To open browser
//		driver.get("https://www.facebook.com/");
//}}

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	webelement result=driver.findElement(By.xpath("//input[@id='email']"));
}
}
