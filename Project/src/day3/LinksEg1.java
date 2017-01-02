package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int lCnt=links.size();
		
		System.out.println("The number of links available in google page is "+lCnt);
		
		for (int i = 0; i < lCnt; i++) 
		{
			String lName=links.get(i).getText();
			System.out.println(lName);
		}
		

	}

}
