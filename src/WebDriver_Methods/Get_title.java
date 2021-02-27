package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {
	
	public static void main(String[] args) throws InterruptedException {

	
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();	
			
			driver.get("https://www.google.com/");
			
			String title= driver.getTitle();
			System.out.println(title);
            Thread.sleep(3000);
            driver.close();
            
            if(title.equals("Google")) {
            	System.out.println("True");
            }
            else {
            	System.out.println("Fail");
            }
            
            String url=driver.getCurrentUrl();
            System.out.println(url);
	}

		
	}


