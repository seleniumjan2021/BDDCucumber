package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/ashu/eclipse-workspace/uiBDDFramework/src/main/java/feature/"
		,glue = {"stepdefinition"} //package name of your step definition
		,plugin = {"pretty" ,"html:test-output" ,"json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		,dryRun = false
		,strict = true
		,monochrome = true		
		,tags = {"@SmokeTest"}
		)
public class TestRunner {

}
