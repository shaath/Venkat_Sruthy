package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//getTitle()
//		System.out.println(driver.getTitle());

		//getCurrentUrl()
//		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
//		System.out.println(driver.getPageSource());
		//quit()
		
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		
		driver.close();
	}

}
