package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginLogoutTest 
{
	public static WebDriver driver;
	@Given("^The browser launched and navigated to url$")
	public void the_browser_launched_and_navigated_to_url() throws Throwable 
	{
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrmlive.com");
	   driver.manage().window().maximize();
	}

	@When("^The Tester enters valid username and valid password$")
	public void the_Tester_enters_valid_username_and_valid_password() throws Throwable
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^also click on login button$")
	public void also_click_on_login_button() throws Throwable 
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Should logout and display welcome Admin message$")
	public void should_logout_and_display_welcome_Admin_message() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(5);
	    String expval="welcome";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
	    Assert.assertEquals(expval, actval);
	}

	@When("^Tester Click on Welcome Admin link$")
	public void tester_Click_on_Welcome_Admin_link() throws Throwable 
	{
	    driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout link$")
	public void also_clicks_on_logout_link() throws Throwable 
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Should logout and display the login page$")
	public void should_logout_and_display_the_login_page() throws Throwable 
	{
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}

}
