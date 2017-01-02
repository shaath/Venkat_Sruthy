package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(5);
		//navigate()
		//Redirecting to the facebook
		driver.navigate().to("http://facebook.com");
		
		//Backbutton
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		
		Sleeper.sleepTightInSeconds(5);
		//Forward
		
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		//Refresh
		
		driver.navigate().refresh();
		
		//Close Browser
		
		driver.close();

	}

}
