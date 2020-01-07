package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class Loginstepdefinition {
	
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.8.1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
	}
//	@When("^title of login page is freecrm$")
//	public void tite_of_login_page_is_freecrm() throws Throwable {
//	    String login_page_title =driver.getTitle().toString();
//	    System.out.print(login_page_title);
//	    //Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", login_page_title);
//	    throw new PendingException();
//	}
	@Then("^user enters username \"(.*)\"$")
	public void user_enters_username(String username)  {
	    driver.findElement(By.name("email")).sendKeys(username);
	}
	@Then("^user enters password \"(.*)\"$")
	public void user_enters_password(String password) {
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}


}
