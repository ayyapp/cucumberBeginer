package cucumberRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)*/
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
		tags={"@TC1"}
)

public class testNG_Runner extends AbstractTestNGCucumberTests {
	
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("At Before Suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	

	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("After Suite");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	

	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	public class RunCukeTest {
		
		
		
				
		
	}

	// "pretty", "html:target/htmlreport"
	// "pretty","json:target/jsonreport/index.json"szs
	// glue = "com.stepdefs"
}
