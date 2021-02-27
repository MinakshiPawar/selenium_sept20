package WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchromebrowser {

		private static final String URL = null;

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();	
			
			driver.get("https://www.google.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//driver.close();
			driver.quit();
		}

	}



