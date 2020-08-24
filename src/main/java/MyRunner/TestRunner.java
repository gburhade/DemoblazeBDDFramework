package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PERENNIAL-QA\\Desktop\\Gaurav\\Eclipse Workspace\\DemoblazeBDDframework\\src\\main\\java\\Features\\Placeorder.feature", 
                 glue="stepDefinitions",
                 format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
                 monochrome = true,  //display console output in readable format
                 strict = true,
                 dryRun = false
)

public class TestRunner 
{

}
