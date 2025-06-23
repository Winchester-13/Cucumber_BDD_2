package PageObj;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Base_class.Base_class;

public class Pageobject extends Base_class {
	

	
	public  Pageobject(WebDriver driver){
		 
		 this.driver=driver;
		 
		//PageFactory.initElements(driver, this);
	
	 }		
	
	public String randomMail() {
		
		return RandomStringUtils.randomAlphabetic(5); 
		
	}
	
	public String randomNumber() {
		
		return RandomStringUtils.randomNumeric(10);
	}
	
	public void firstName(String firstname) {
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstname);
	}
	
	public  void myAccount() {
		
		driver.findElement(By.linkText("My Account")).click();
	}
	

	public  void register() {
	
		driver.findElement(By.linkText("Register")).click();

	}

	public  void lastName(String lastname) {
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}
	

	public  void email(String email) {
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	}
	
	public  void password(String password) {
		
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		
	}
	
	public  void cnfpassword(String cnfpassword) {
		
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys(cnfpassword);
				
	}
	
	public  void chkbox() {
	
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	
	public  void continuebtn() {
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	public  void tele(String telephn) {
		
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys(telephn);
	}
	
	public  String text() {
		
		String msg= driver.findElement(By.xpath("//*[contains(text(), 'Congratulations! Your new account has been successfully created!')]")).getText();
		
		return msg;
		
	}
		
	
}




