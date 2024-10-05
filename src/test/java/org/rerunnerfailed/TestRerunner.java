package org.rerunnerfailed;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\A\\eclipse-workspace\\CucumberSample\\src\\test\\resources\\file\\failedscenarios\\failed.txt",glue="org.stepdefinitionfiletestcheck")


public class TestRerunner {
	


}
