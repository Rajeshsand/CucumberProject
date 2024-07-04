package org.scenariooutline;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.pomframe.TestPojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenitionSceoutline extends BaseClass {
	
	TestPojoclass tpc = new TestPojoclass();
	
	@Given("To open the chrome browser and maximize the window")
	public void to_open_the_chrome_browser_and_maximize_the_window() {
	   
		launchBrowser("Chrome");
		maxiWindow();
	}

	@When("To launch the url of the application")
	public void to_launch_the_url_of_the_application() {
	  
		launchUrl("https://www.facebook.com/");
		
		
	}

	@When("To pass the positive and negative values in {string}usename field for validation")
	public void to_pass_the_positive_and_negative_values_in_usename_field_for_validation(String ema) {
	   
		
		txtEnter(tpc.getTxtEmail(), ema);
		
	}

	@When("To pass the positive and negative values in  {string}password field for validation")
	public void to_pass_the_positive_and_negative_values_in_password_field_for_validation(String pass) {
	    
		txtEnter(tpc.getTxtPass(), pass);
	}

	@When("To execute the login button")
	public void to_execute_the_login_button() {
	    
		btnClick(tpc.getLogBtn());
		
	}

	@Then("Close the application page and browser")
	public void close_the_application_page_and_browser() {
	   
		// driver.close();
	}

}
