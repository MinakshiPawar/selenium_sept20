package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizeListboxUsing_ArrowUp_Down_arrow {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
				Thread.sleep(2000);
		
				Actions act=new Actions(driver);

//	act.sendKeys(Keys.ARROW_UP).perform();// to print nov month just do one arrowup
//
//	act.sendKeys(Keys.ARROW_UP).perform();// to print oct we have to do 2 arrowup
//	act.sendKeys(Keys.ENTER).perform();
				
				for(int i=1;i<=9;i++)
				{
					act.sendKeys(Keys.ARROW_UP).perform();
					Thread.sleep(2000);
					
				}
				month.click();
	}
}