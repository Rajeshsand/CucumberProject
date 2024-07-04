package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources" ,glue = {"org.stepdefinition","org.scenariooutline"}, plugin ="pretty" , monochrome =true , dryRun=false ,strict=true)


public class TestRunnerClass {
	
	
	

}
