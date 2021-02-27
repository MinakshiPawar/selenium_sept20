package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class navigateToMainPageFromIframe {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			//switch to frame using id
			driver.switchTo().frame("iframeResult");    
			Thread.sleep(3000);
			
			//click on an element
			driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
			
			//switch to main page
			//driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			
			
			//Perform action on main page
			
			driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		}
}