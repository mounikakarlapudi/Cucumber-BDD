package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
	}

	@When("^ I entered valid credentials$")
	public void  I_entered_valid_credentials() throws Throwable{
		driver.findElement(By.id("email")).sendKeys("mounikakarlapudi24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		
	}
	
	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable{
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
		
	}
}
