package Stepdefinitions_02;
import java.time.Duration;
import java.util.Map;
import Hooks.Hooks;
import PageObj.Pageobject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObj.Pageobject;
import Base_class.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions_02 extends Base_class {

	Pageobject pg;
	WebDriver driver;
		
	@Given( "the user navigates to the website and clicks on My Account and My Register buttons")
	
	public void openSite () {
	
		//Base_class.myAccount();
		//Base_class.register();
		//driver=new ChromeDriver();
		pg=new Pageobject(driver);

		
	}
	
	@When("the user provides the following data")
	public void the_user_provides_the_following_data(io.cucumber.datatable.DataTable dataTable) {
	 
		Map<String, String> Mapdata=dataTable.asMap(String.class, String.class);
		
		pg.firstName(Mapdata.get("firstName"));
		pg.lastName(Mapdata.get("lastName"));
		pg.email(pg.randomMail()+"@gmail.com");
		pg.tele(pg.randomNumber());
		pg.password(Mapdata.get("Password"));
		pg.cnfpassword(Mapdata.get("Password"));		
		
	}

	@When("the user clicks on the privacy policy checkbox")
	public void the_user_clicks_on_the_privacy_policy_checkbox() {
		
		pg.chkbox();
		
	}

	@When("the user clicks the Continue button")
	public void the_user_clicks_the_continue_button() {
		
		pg.continuebtn();

	}

	@Then("the user should see the registration successful message")
	public void the_user_should_see_the_registration_successful_message() {
		
		Assert.assertTrue(pg.text(),true);
		System.out.println(pg.text());
	}
	

	
}
