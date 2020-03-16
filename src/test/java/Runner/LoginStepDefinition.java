package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition  {
	@Given("launch the browser")
	public void launch_the_browser() {
		System.out.println("acdfss");
	   
	}

	@When("load the facebook url")
	public void load_the_facebook_url() throws InterruptedException {
		Hook.driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	 
	}

	@When("Enter username and password in facebook page")
	public void enter_username_and_password_in_facebook_page() throws InterruptedException {
		Hook.driver.findElement(By.id("email")).sendKeys("abcdef");
		Hook.driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(3000);
	    
	}

	@When("user click the login button")
	public void user_click_the_login_button() throws InterruptedException {
		Hook. driver.findElement(By.id("loginbutton")).click();
		  Thread.sleep(3000);
	    
	}

	@Then("User succesfully login the facebook page")
	public void user_succesfully_login_the_facebook_page() {
		System.out.println("page successfully launched");
		
	    
	}

	}




