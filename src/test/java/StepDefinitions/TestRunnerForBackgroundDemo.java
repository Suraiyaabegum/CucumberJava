package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithBackground", //path where our feature files are kept
glue= {"StepsForBackground"},
monochrome=true,
plugin = {"pretty","html:target/HTMLReports"
		          ,"json:target/JSONReports/report.json"
	              ,"junit:target/JUnitReports/report.xml" } // it is used to create a report
)

public class TestRunnerForBackgroundDemo {

}


