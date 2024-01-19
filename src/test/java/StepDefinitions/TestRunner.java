package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", //path where our feature files are kept
glue= {"StepDefinitions"},
monochrome=true,
plugin = {"pretty","html:target/HTMLReports"
		          ,"json:target/JSONReports/report.json"
	              ,"junit:target/JUnitReports/report.xml" } // it is used to create a report
)
public class TestRunner {

}
