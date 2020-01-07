package testrunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			 features="C:\\eclipse\\Freecrmcucumberproject\\src\\main\\java\\feature", //path of feature file
			 glue={"stepdefinition"}, //path of step definition
			 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
					 "junit:target/cucumber-reports/Cucumber.xml",
					 "html:target/cucumber-reports"}, //different type of reporting formats
			 dryRun = true, //just to ensure that we have added code for each step of the feature file in step definition file	
			 strict = true, //to ensure if all the steps in steps definition are defined
			 monochrome = true) //to make output on console more readable
	public class Testrunner
	{
	 
		
	}

