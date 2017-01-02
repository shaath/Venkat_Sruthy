package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg6 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td/ul"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			System.out.println(lText);
			
			links.get(i).click();
			
			System.out.println(driver.getTitle()+"------"+driver.getCurrentUrl());
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
			block=driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td/ul"));
			links=block.findElements(By.tagName("a"));
		}
		
	}
	

}
