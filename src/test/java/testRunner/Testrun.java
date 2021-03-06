package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/Feature/"},
		glue = {"stepDefinitions"},
		plugin = {"pretty","html:report"},		
		strict = true		
		)

public class Testrun{
	
}