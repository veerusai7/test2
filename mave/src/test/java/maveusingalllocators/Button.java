package maveusingalllocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
	@Test
	public  void Buttonmethod() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 driver.get("http://www.leafground.com/");
	 driver.findElement(By.linkText("Button")).click();
	// driver.findElement(By.id("home")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\'position\']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("color")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("size")).click();
	   driver.findElement(By.id("home")).click();
	}
}
