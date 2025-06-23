package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Base_class;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base_class{
	
	
	@Before
	public void setUp() {
		

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
