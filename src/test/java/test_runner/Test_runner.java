package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={".//feature/Login.feature"}, 
		glue="Stepdefinitions"
		)


		
		
		public class Test_runner {

}
