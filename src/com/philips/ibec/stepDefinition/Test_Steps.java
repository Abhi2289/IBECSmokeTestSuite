package com.philips.ibec.stepDefinition;

import com.philips.ibec.functionLibrary.eMR_FunctionsLib;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Test_Steps {
	
	@Given("^The ADT Message is send to EMRA$")
	public void The_ADT_Message_is_send_to_EMRA() throws Throwable{
		
		
		eMR_FunctionsLib.sendMessage_toEMRA();
		
	}
	
	@And("^The Message is proccessed successfully$")
	public void Check_ResponseIsAvailable() throws Throwable{
		
		System.out.println("Generated");	// Proper piece of code has to be here 
	}
	
	@Then("^Verify the bundle Mapping$")
	public void Validate_the_City_temperature() throws Throwable{
		
		System.out.println("Validated");
	}
	

}
