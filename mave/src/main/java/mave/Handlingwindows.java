package mave;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows {
	
	
	public static void main(String[] args) throws Exception {


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	// Load the website
	driver.get("http://www.naukri.com/");

	// It will return the parent window name as a String
	String parent=driver.getWindowHandle();
   }
}