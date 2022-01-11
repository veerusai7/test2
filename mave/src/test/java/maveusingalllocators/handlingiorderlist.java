package maveusingalllocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class handlingiorderlist {
	@Test
public void selectble()
 {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Selectable.html");
   List<WebElement> elements=(driver.findElements(By.xpath("//ul[@class='deaultFunc']/li")));
   System.out.println(elements.size());
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).click(elements.get(0))
	.click(elements.get(1))
	.click(elements.get(3)).click(elements.get(6)).build().perform();
	}
}
