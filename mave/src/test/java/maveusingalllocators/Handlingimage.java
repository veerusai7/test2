package maveusingalllocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingimage {
	
  @Test
	public  void image() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 driver.get("http://www.leafground.com/");
	 driver.findElement(By.linkText("Image")).click();
	 driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img")).click();
  }
}