package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Dimension {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		driver.navigate().to("https://www.google.com/");

Thread.sleep(3000);
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
}
}
