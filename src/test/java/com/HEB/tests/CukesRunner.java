package com.HEB.tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json"
		
		},
		
		tags= "@coupons",
				
		features= "src/test/resources",
				
		glue= "com/HEB/stepdefs"
			
		
		,dryRun =false
		)
public class CukesRunner {}
