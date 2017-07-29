package day34.Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class FindAFlight extends BaseClass {
	
	@Test
	
	public void flightFinder()
	{
		f.findElement(By.name("passCount")).sendKeys("2");
		f.findElement(By.name("fromPort")).sendKeys("Sydney");
		f.findElement(By.name("toPort")).sendKeys("California");
		Sleeper.sleepTightInSeconds(4);
		f.findElement(By.name("findFlights")).click();
		
	}

}
