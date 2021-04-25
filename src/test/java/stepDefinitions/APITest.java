package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest{
	
	Response response;
	
	@Given("open the endpoint url")
	public void openurl() {	    
	    RequestSpecification request = RestAssured.given();
	    
	    response  = request.get("https://v6.exchangerate-api.com/v6/1fc80820c72b0163bc9c7536/latest/usd");
	}

	@When("validate HTTP status code")
	public void validatestatus() {
	   	    
		Assert.assertEquals(200, response.getStatusCode());		
		
		System.out.println("HTTP Status code:" + response.getStatusCode());	
		
	}

	@Then("get and validate currency")
	public void validatecurrency() {
		int pos;String resp;String[] arr;
		boolean check = false;
			
		resp = response.asString();
				
		pos = resp.indexOf("{", 2);
		resp = resp.substring(pos + 1,resp.length() - 2);
		
		//System.out.println(resp);
		
		arr = resp.split(",");
		System.out.println("Total no.of Currencies:" + arr.length);
		
		for(int i =0;i < arr.length;i++) {
			if (arr[i].contains("GBP")) {
				check = true;
			}
		}
		
		if (check = true) {
			Assert.assertTrue(true);
			System.out.println("Verified GBP currency is present in the response");
		}
		else {
			Assert.fail();
		}
	}

}