package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		//To open browser
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//To put value in email field
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("minu@gmail.com");
		
		//To put value is password field
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@123");

       //To click on login 
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		
		
	
		
		
}

}
