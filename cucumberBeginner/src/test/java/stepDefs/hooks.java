package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.utilityMethods;

public class hooks
{
    public static WebDriver driver;
	static public WebDriverWait wait;
	public Scenario scenario;
	
	@Before
	public void startUp(Scenario scenario)
	{
		
		/*driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/");*/
		System.out.println("Before Hook");
		this.scenario=scenario;
		String exePath = "./chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.get("http://store.demoqa.com/");
		System.out.println(scenario.getName()+" Scenario Execution Starts...");
		System.out.println("Using getID method of scenario: "+scenario.getId());
		driver.manage().window().maximize();
		wait= new WebDriverWait(driver, 20);
		
		
	}
	
	@Before("@TC1")
	public void set2()
	{
		System.out.println("Tagged Before Hook");
	}
	
	@After("@TC1")
	public void set1()
	{
		System.out.println("Tagged After Hook");
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		System.out.println("After Hook");
		if(scenario.isFailed())
		{
			utilityMethods.captureScreenshot(driver, scenario.getName());
		}
		System.out.println("Scenario status is "+scenario.getStatus());
		driver.close();
		
	}

}
