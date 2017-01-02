package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodEgEg3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		WebElement email=driver.findElement(By.id("Email"));
//		System.out.println(gmail.getText());
		
		String link=email.getAttribute("placeholder");
		System.out.println(link);
	}

}
