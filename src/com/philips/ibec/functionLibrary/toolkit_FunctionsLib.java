package com.philips.ibec.functionLibrary;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class toolkit_FunctionsLib extends genericFunctionLib {
	
	public static void sendMessage_toToolkit()
	{   
	
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	
		RequestSpecification httpRequest = RestAssured.given();
	
		Response response = httpRequest.request(Method.GET, "/Hyderabad");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		

	}
  
	
	public static void downloadBundleToolkit()
	{
		
	}

}
