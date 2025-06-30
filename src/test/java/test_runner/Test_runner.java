package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
	features=".//feature/Scenario_outline.feature",
	glue={"Stepdefinitions_03","Hooks"},
	plugin= {"pretty",
			"html:target/cucumber-reports.html"   
	}

		
		
		)

class Test_runner{
}

