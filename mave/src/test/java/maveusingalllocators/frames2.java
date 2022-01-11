package maveusingalllocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames2 {
    @Test
    public void m1()
    {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeru  Sai\\eclipse-workspace\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver dr= new ChromeDriver();
	dr.get("http://demo.automationtesting.in/Frames.html");
	//single frames
	dr.switchTo().frame("singleframe");
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("veeru");
	dr.switchTo().defaultContent();
	//multiple frames
	/*dr.findElement(By.linkText("Iframe with in an Iframe")).click();
	dr.switchTo().frame(0);
	System.out.println("hii");
	WebElement ele = dr.findElement(By.xpath("/html/body/section/div/div/iframe"));
	dr.switchTo().frame(0);
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("sai");
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   WebElement ele = dr.findElement(By.xpath("/html/body/section/div/div/iframe"));
   dr.switchTo().frame(ele);*/
    // multiple frames
	dr.findElement(By.linkText("Iframe with in an Iframe")).click();
	//using absolute path
   /* WebElement  ele=dr.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	dr.switchTo().frame(ele);*/
	// using relative x path
	WebElement  ele=dr.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	dr.switchTo().frame(ele);
	System.out.print("this is veeru");
	WebElement  el=dr.findElement(By.xpath("/html/body/section/div/div/iframe"));
	dr.switchTo().frame(el);
	System.out.print("this is sai");
	dr.findElement(By.xpath("//input[@type='text']")).sendKeys("frames completed");
	
    } 
}
