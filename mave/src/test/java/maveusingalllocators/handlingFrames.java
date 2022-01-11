package maveusingalllocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlingFrames {
	@Test
  public void frame() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("http://www.leafground.com/pages/frame.html");
		//single frame
		dr.switchTo().frame(0);
		dr.findElement(By.id("Click")).click();
		dr.switchTo().defaultContent();
		//double frame
		
		dr.switchTo().frame(1);
		dr.switchTo().frame("frame2");
		dr.findElement(By.id("Click1")).click();
		dr.switchTo().parentFrame();
  }
}
