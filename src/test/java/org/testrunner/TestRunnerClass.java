package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreportgenerator.JvmReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/LoginFunctionalityUsingDataTable.feature" ,glue = "org.stepdefinitionfiletestcheck", plugin = {"html:target/HTMLReport","junit:target/JunitReport/Junit.xml","json:target/JsonReport/JsReport.json","rerun:src/test/resources/file/failedscenarios/failed.txt"} , monochrome =true , dryRun=false ,strict=true )


public  class TestRunnerClass extends JvmReportGeneration {
	
	@AfterClass
	public static void jvmReport() {
		
		generateReport("C:\\Users\\A\\eclipse-workspace\\CucumberSample\\target\\JsonReport\\JsReport.json");

	}
	
	
	
	
	

}
