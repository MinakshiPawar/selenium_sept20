package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		//To open browser
		driver.get("https://www.facebook.com/");
		
//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();		

//driver.findElement(By.xpath("//button[contains(id(),'login')]")).click();		
driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("abcd123");

driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("abcd123@");

driver.findElement(By.xpath("//button[contains(@class,'_42ft ')]")).click();
}}

