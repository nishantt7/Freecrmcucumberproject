package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Contactfeaturestepdefinition {
	
WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.8.1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
	}
	
	@Then("^user enters username$")
	public void user_enters_username(DataTable username)  {
          username.raw();
          
	   
	}

	@Then("^user enters password$")
	public void user_enters_password(DataTable arg1)  {

	}

	@Then("^user navigates to contacts page$")
	public void user_navigates_to_contacts_page()  
	{
	    
	}

	@Then("^user clicks on new button$")
	public void user_clicks_on_new_button()
	{
	    
	}

	@Then("^user enters first name and last name and company name and email and  position and department$")
	public void user_enters_first_name_and_last_name_and_company_name_and_email_and_position_and_department(DataTable arg1) {
	    
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button()
	{
		
	}

	@Then("^user closes the browser$")
	public void user_closes_the_browser() {
	   
	}

}
