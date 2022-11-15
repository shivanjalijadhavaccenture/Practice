package Autoclose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
public static void main(String[] args) {
	//WebDriver driver=WebDriverManager.chromedriver().create();//create() automatically closes the browser
	//WebDriver driver=WebDriverManager.firefoxdriver().create();
	
	 WebDriver driver=WebDriverManager.edgedriver().create();		
	 driver.get("https://www.amazon.in/");
	
	//we have to write close() method
	 
	/*WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");*/
}
}
