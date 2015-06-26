package com.emmasdiary.steps;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

	
@RunWith(Cucumber.class)
@CucumberOptions(
					plugin = {"pretty", "html:target/cucumber"},
					features = {"src/test/resources/com/emmasdiary/features"},
					tags = {}
				//	glue = {"com/emmasdiary/features"}
		)
	 
public class RunnerCukes {}
