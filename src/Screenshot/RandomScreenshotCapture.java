package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class RandomScreenshotCapture {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
  Thread.sleep(3000);
  
  String str=RandomString.make(2);    // To save file name with additional two strings just to no need to give any other file name everytime
  
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Lenovo\\Selenium\\Screenshot\\xyz"+str+".jpg");
FileHandler.copy(source, dest);


}
}