package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*features = "src/test/java/featuresFile",*/
		/*features={"classpath:featuresFile/homePage.feature","classpath:featuresFile/productsPage.feature",
				"classpath:featuresFile/add2Kart.feature"},*/
		
		features={"classpath:featuresFile"},
		glue = {"classpath:stepDefs"}, 
		monochrome = true,
		strict=true,
		dryRun = false,
        plugin  = {"pretty", "json:target/reports/jsonreport/index.json","html:target/reports/htmlreport","junit:target/reports/xmlreport.xml"},
		tags={"@TC2"}
)

public class runnerClass {
	
	

	public class RunCukeTest {

	}

	// "pretty", "html:target/htmlreport"
	// "pretty","json:target/jsonreport/index.json"szs
	// glue = "com.stepdefs"
}
