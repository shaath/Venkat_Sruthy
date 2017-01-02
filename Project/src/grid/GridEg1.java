package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridEg1 
{
	@Test
	public void test() throws MalformedURLException
	{
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://10.172.0.15:4444/wd/hub"), cap);
		
		String date="18/march/2018";
		
		String[] split=date.split("/");
		
		String day=split[0];
		String month=split[1];
		String year=split[2];
		
		System.out.println(day+"----"+month+"------"+year);
		
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		//year selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		System.out.println(calyear);
		
		while(!year.equals(calyear))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}

		//month selection
		
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!month.equalsIgnoreCase(calmonth))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//Day selection
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		for (int i = 0; i < cols.size(); i++) 
		{
			String calday=cols.get(i).getText();
			
			if (calday.equals(day)) 
			{
				cols.get(i).click();
				break;
			}
		}
		
	}

}
