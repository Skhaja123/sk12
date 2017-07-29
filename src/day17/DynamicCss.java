package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicCss {
	
	FirefoxDriver f;
	@BeforeTest
	public void setup()
	{
		f = new FirefoxDriver();
		f.get("http://opensource.demo.orangehrmlive.com");
	}
	
	@Test
	public void cssTest()
	{
		f.findElement(By.cssSelector("input[id^='txtUser']")).sendKeys("Admin");
		f.findElement(By.cssSelector("input[id$='Password']")).sendKeys("admin");
		f.findElement(By.cssSelector("input[id*='nLog']")).click();
	}

}
