package com.philips.ibec.SmokeTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="Feature"
		,glue={"com.philips.ibec.stepDefinition"}
		)

public class TestRunner {

}
