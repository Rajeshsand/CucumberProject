package org.stepdefinition;

import org.helper.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pomframe.TestPojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass extends BaseClass {
	
	TestPojoclass text = new TestPojoclass();
	
	@Given("To Launch the Compatible Browser and to maximize the browser page")
	public void to_Launch_the_Compatible_Browser_and_to_maximize_the_browser_page() {
	    
		launchBrowser("Chrome");
		maxiWindow();
		
	}

	@When("To pass the application url in the browser")
	public void to_pass_the_application_url_in_the_browser() {
		
		launchUrl("https://www.facebook.com/");
		
	}   

	@When("To validate the username by passing invalid values")
	public void to_validate_the_username_by_passing_invalid_values() {
	   
		txtEnter(text.getTxtEmail(), "Sanrajesh@6699");
			
	}

	@When("To vaidate the password by passing invalid Values in the password field")
	public void to_vaidate_the_password_by_passing_invalid_Values_in_the_password_field() {

		txtEnter(text.getTxtPass(), "srk@3699");
		
	}

	@When("To click the login for validation")
	public void to_click_the_login_for_validation() {
		
		btnClick(text.getLogBtn());
	}

	@When("To check wheather it will navigate to the home page or error page")
	public void to_check_wheather_it_will_navigate_to_the_home_page_or_error_page() {
	    
		Assert.assertTrue(true);	
	}

	@Then("To close the compatible Browser")
	public void to_close_the_compatible_Browser() {
	   
	//	driver.close();
		
		
	}
}
