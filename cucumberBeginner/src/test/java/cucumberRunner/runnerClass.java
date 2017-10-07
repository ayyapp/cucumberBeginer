package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerClass {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/featuresFile",
			glue = "src/test/java/stepDefs", 
			monochrome = true,
			dryRun = false,
	        plugin  = {"pretty", "json:target/reports/jsonreport/index.json","html:target/reports/htmlreport","junit:target/reports/xmlreport.xml"}
	)

	public class RunCukeTest {

	}

	// "pretty", "html:target/htmlreport"
	// "pretty","json:target/jsonreport/index.json"
	// glue = "com.stepdefs"
}
