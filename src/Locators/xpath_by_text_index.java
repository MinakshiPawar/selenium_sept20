package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text_index {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		//To open browser
		driver.get("https://www.facebook.com/");
		
		//syntax: tagname[text()='text value']
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//To click on create new account
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(3000);
		//To enter firstname in sign up page
	// driver.findElement(By.xpath("//input[@id='u_h_b']")).sendKeys("xxx");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Minakshi");
		
	
}
}
