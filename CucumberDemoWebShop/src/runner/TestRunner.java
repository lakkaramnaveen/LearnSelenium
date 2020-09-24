package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"stepDefinition"},plugin = {"pretty","html:test-output","json:json_output/cucumber_report","junit:junit_xml/cucumber.xml"})
//,monochrome = true
//tags= {"@smoke"},
public class TestRunner {
	
}
