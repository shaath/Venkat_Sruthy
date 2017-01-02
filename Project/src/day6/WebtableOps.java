package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class WebtableOps {

	public static void main(String[] args)
	{
//		WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.partialLinkText("Employee")).click();
		Sleeper.sleepTight(5000);
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
//			System.out.println("The number of columns "+cols.size());
			
			String f=cols.get(2).getText();
			System.out.println("The first name of the employee "+f);
			
		}
	}

}
