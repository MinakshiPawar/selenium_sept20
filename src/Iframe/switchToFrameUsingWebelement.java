package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class switchToFrameUsingWebelement {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
			
			WebElement ele=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
			
			driver.switchTo().frame(ele);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		}

	}



