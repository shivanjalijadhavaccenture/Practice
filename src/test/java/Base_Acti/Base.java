package Base_Acti;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {
	public WebDriver driver;
	
	public void intializeBrowser() {
	 
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.actitime.com/login.do");
	  
	}

}
