package org.stepdefinitionfiletestcheck;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	
	
	@Before(order = 2)
	
	public static void preCondition1() {
		
		System.out.println("PreCondition 2");
		

	}
	
    @Before(order = 1)
	
	public static void preCondition2() {
		
    	System.out.println("Precondition 1");

	}
	
	@After(order =9)
	
	public static void postCondtion1(Scenario s) {
		
	  if (s.isFailed()) {
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
		  s.embed(ss, "image/png");
		
	}		
	}
	
    @After(order = 8)
	
	public static void postCondtion2() {
		
    	System.out.println("Close the Browser");
		
		
	}
	
	
	
	
	
	
	
	
	

}
