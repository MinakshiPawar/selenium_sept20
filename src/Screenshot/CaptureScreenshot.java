package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
  Thread.sleep(3000);

  
  //1.we need to type cast driver obj into take screenshot interface
  //2. then we need to call function get screenshot as method here we need to pass argument output.file
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     //To take a screenshot
	
	File dest=new File("C:\\Users\\Lenovo\\Selenium\\Screenshot\\xyz.jpg");     //Provide dest address
	FileHandler.copy(source, dest);
	
	}
}
