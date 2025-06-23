package test_runner;
//package Stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		
		features=".//feature/Multiple_login.feature",
		glue= {"Stepdefinitions_02", "Hooks"}
		
		)


		

class Test_runner{
	
}