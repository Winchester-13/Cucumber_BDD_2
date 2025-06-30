package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Base_class.Base_class;

public class Pageobject_login {

	WebDriver driver;
	
	public Pageobject_login() {
		
		this.driver=Base_class.driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(how=How.XPATH, using="//input[@id='input-password']")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(how=How.XPATH, using="//*[@title=\"My Account\"]")
	WebElement myaccount;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Login']")
	WebElement login;
	
	
	
	
	public void enterEmail(String s) {
		email.sendKeys(s);
	}
	
	public void enterPassword(String p) {
		password.sendKeys(p);
	}
	public void clickLoginBtn() {
		loginbtn.click();
	}
	
	
	public void clickMyAccount() {
		//myaccount.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(myaccount).click().build().perform();		
	}
	
	
	public void clickLogin() {
		login.click();
	}
	
}
