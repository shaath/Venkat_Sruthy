package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginTest {

	public static void main(String[] args)
	{
		//Launch Firefox browser
		WebDriver driver=new FirefoxDriver();
		//get()--->Launch App
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		//identifying the email textbox
		
		WebElement email=driver.findElement(By.id("Email"));
		//sending text into the email textbox
	
		email.sendKeys("sharathqedge449");
		
//		Sleeper.sleepTightInSeconds(5);
		
		//Deleting the text from text box
		
//		email.clear();
		//Clicking on the next button
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		//Entering the password into password textbox
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("123456789");
		
		//Clicking on signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
	}

}
