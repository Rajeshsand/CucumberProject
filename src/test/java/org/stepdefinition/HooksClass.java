package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	
	
	
	@Before(order=2)
	
	private void preCondition1() {
			
	}
    
	@Before(order=1)
    private void preCondition2() {
		
		
		
	}
	
	@After(order=4)
	
	private void postCondition1() {
			

	}
	@After(order=3)
    private void postCondition2() {
		
		
		

	}
}
