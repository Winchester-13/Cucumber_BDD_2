package Hooks;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Base_class;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks{
	
	WebDriver driver;
	
	Properties p;
	
	@Before
	public void setUp() throws IOException {
		
	
		FileReader file=new FileReader(".//src/test/resources/config.properties");
		p=new Properties();
		p.load(file);
		
		
		
		Base_class.driver=new ChromeDriver();
		Base_class.driver.manage().window().maximize();
		Base_class.driver.get(p.getProperty("url"));
		Base_class.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		}
	
	@After
	public void tearDown() {
		
		Base_class.driver.quit();
	}
	
	

}
