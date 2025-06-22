package Stepdefinitions_01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions_01{

	WebDriver driver;
	
	
/*	
	

@Given("the user opens the website")
public void the_user_opens_the_website() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
}

@When("the user enters username {string} and password {string}")
public void enterUsernamePassword(String username, String pass) {
	
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pass);
}

@And("the user clicks on the login button")
public void clicks_on_the_login_button() {
    
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@Then("user should see the welcome message")
public void user_should_see_the_welcome_message() {
	
	String msg= driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).toString();
    
    Assert.assertEquals(msg, "My Account");
    System.out.println("Test passed!\n"+ msg);
    
}


}*/
	
@Given("the user opens the website")
public void the_user_opens_the_website() {
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

}
		
@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String string, String string2) {
	
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(string2);
	
	}

@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
	 
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}
@Then("user should see the welcome message")
	public void user_should_see_the_welcome_message() {
	
		//String msg= driver.findElement(By.xpath("(//*[contains(text(), 'My Account')])[1]")).getText();
		String msg= driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]")).getText();
		
		Assert.assertTrue(msg, true);
	
	System.out.println("Test passed!\n"+ msg);
	
	}
	
}	
	