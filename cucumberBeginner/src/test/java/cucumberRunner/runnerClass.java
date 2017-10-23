package cucumberRunner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*features = "src/test/java/featuresFile",
		features={"classpath:featuresFile/homePage.feature","classpath:featuresFile/productsPage.feature",
				"classpath:featuresFile/add2Kart.feature"},*/
		
		features={"classpath:featuresFile"},
		glue = {"classpath:stepDefs"}, 
		monochrome = true,
		strict=true,
		dryRun = false,
        plugin  = {"pretty", "json:target/reports/jsonreport/index.json","html:target/reports/htmlreport","junit:target/reports/xmlreport.xml"},
		tags={"@TC1"}
)

public class runnerClass {
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("After Class");
	}
	
	@Before
	public static void before()
	{
		System.out.println("@Before....JUNIT");
	}
	
	
	@After
	public static void after()
	{
		System.out.println("@After...JUNIT");
	}
	
	public class RunCukeTest {

	}

	// "pretty", "html:target/htmlreport"
	// "pretty","json:target/jsonreport/index.json"szs
	// glue = "com.stepdefs"
}
