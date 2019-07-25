package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "C:\\Users\\win10\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\Features\\login.feature",
		glue= {"stepDefinitions"},
		//glue= "C:\\Users\\win10\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\stepDefinitions",
		//format= {"pretty","html:test-output"}, "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
		
		
		)



public class TestRunner {

	
	
	
}
