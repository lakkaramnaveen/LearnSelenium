package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"stepDefinition"},tags= {"@smoke"},plugin = {"pretty","html:test-output","json:json_output/cucumber_report"})
//,monochrome = true
public class TestRunner {
	
}
