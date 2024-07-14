package org.stepdefinitionfiletestcheck;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;
import org.junit.Assert;
import org.pomframe.TestPojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenesionDataTable extends BaseClass {
	
	TestPojoclass txt;
	
	@Given("To Launch the  Browser and to maximize the Web page")
	public void to_Launch_the_Browser_and_to_maximize_the_Web_page() {
	   
		launchBrowser("Chrome");
		maxiWindow();
		
	}

	@When("To pass the FB application url in the browser")
	public void to_pass_the_FB_application_url_in_the_browser() {
	   
		launchUrl("https://www.facebook.com/");
		
	}

	@When("To validate the username by passing values")
	public void to_validate_the_username_by_passing_values(io.cucumber.datatable.DataTable d) {
	   
		txt = new TestPojoclass();
		Map<String, String> mp = d.asMap(String.class, String.class);
		txtEnter(txt.getTxtEmail(), mp.get("Username 2"));
		
	}

	@When("To vaidate the password by passing Values in the password field")
	public void to_vaidate_the_password_by_passing_Values_in_the_password_field(io.cucumber.datatable.DataTable d ) {
	   
		List<Map<String, String>> asm = d.asMaps();
		txtEnter(txt.getTxtPass(), asm.get(1).get("Password 2"));
		Assert.assertTrue(false);
	}

	@When("To click the login button for validation")
	public void to_click_the_login_button_for_validation() {
		
		btnClick(txt.getLogBtn());
	}

	@When("To check wheather it will navigate to the home page or not")
	public void to_check_wheather_it_will_navigate_to_the_home_page_or_not() {
	   
		
		Assert.assertTrue(true);
	}

	@Then("To close the web page")
	public void to_close_the_web_page() {
	    
//		driver.close();
	}



}
