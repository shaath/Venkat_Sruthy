package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MouseHoverEg2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[2]/ul/li[6]/a/span")).click();
		
	}

}
