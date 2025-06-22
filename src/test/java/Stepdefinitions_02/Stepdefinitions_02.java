package Stepdefinitions_02;
import java.util.Map;

import org.junit.Assert;

import Base_class.Base_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions_02 extends Base_class {

	
	Base_class base=new Base_class();
	
	@Given( "the user navigates to the website")
	public void openSite() {
		
		base.setUp();
	}
	
	@When("the user provides the following data")
	public void the_user_provides_the_following_data(io.cucumber.datatable.DataTable dataTable) {
	 
		Map<String, String> Mapdata=dataTable.asMap(String.class, String.class);
		
		base.firstName(Mapdata.get("firstName"));
		base.lastName(Mapdata.get("lastName"));
		base.email(base.randomMail()+"@gmail.com");
		base.tele(base.randomNumber());
		base.password(Mapdata.get("Password"));
		base.cnfpassword(Mapdata.get("Password"));		
		
	}

	@When("the user clicks on the privacy policy checkbox")
	public void the_user_clicks_on_the_privacy_policy_checkbox() {
		
		base.chkbox();
		
	}

	@When("the user clicks the Continue button")
	public void the_user_clicks_the_continue_button() {
		
		base.continuebtn();

	}

	@Then("the user should see the registration successful message")
	public void the_user_should_see_the_registration_successful_message() {
		
		Assert.assertTrue(base.text(), true);
		System.out.println(base.text());
	}
	
}
