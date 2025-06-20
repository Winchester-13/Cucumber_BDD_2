package test_runner;
//package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={".//feature/login.feature"}, 
		glue={"Stepdefinitions"}
		)


		
		
public class Test_runner {

}
