package maveusingalllocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class allLocatorsUsingEditbox {
	@Test
	public  void EditMethod() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	 driver.get("http://www.leafground.com/");
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.id("email")).sendKeys("veeru");
	 driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("sai");
	 driver.findElement(By.name("username")).sendKeys("vs");
	 //absolute xpath
	// driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input")).sendKeys("yes");
	 //relative xpath
	 driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("yes");
	}
	
}
