package Stepdefinitions_03;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Base_class;
import Hooks.Hooks;
import PageObj.Pageobject_login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions_03 {
	
	WebDriver driver;
	Pageobject_login login= new Pageobject_login(); 
	
	@Given("the user navigates to website")
	public void openWebsite() {
		
		
	}
	
	
    @When ("the user clicks on My Account menu")
    public void myAccountmenu() {
    	
    	login.clickMyAccount();
    }
    
    @And("the user clicks on Login submenu")
    public void loginSubmenu() {
    	
    	login.clickLogin();
    }
    
    @And("the user enters {string} and {string}")
    public void enterCreds(String emailid, String pwd){//DataTable datatable) {
    	
    	//Map<String, String>mapping=datatable.asMap(String.class, String.class);
    	
    	
    	login.enterEmail(emailid);
    	login.enterPassword(pwd);
    }
    
    @Then ("the user should successfully login")
    public void success() {
    	
    	login.clickLoginBtn();
    	
    }
    		
    		


	
	}
