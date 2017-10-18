package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class productPage_StepDefs {
	
	static WebDriver driver;
	boolean b;
	private base common;
	
	public productPage_StepDefs(base common) {
		// TODO Auto-generated constructor stub
		this.common=common;		
		
	}
	
	
	
	
	@Given("^User is at DemoQA HomePage$")
	public void user_is_at_DemoQA_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=hooks.getDriver();
		String title=driver.getTitle();
		    if(title.contains("ONLINE STORE"))
		    {
		    	System.out.println("User is at DemoQA Home Page");
		    }
		    else
		    {
		    	Assert.fail("User is not at home page instead it is in "+title);
		    }
	}

	@When("^User hovers over \"([^\"]*)\" link$")
	public void user_hovers_over_link(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	
	    common.getproductPage(driver).hover(element);
	    System.out.println(element +" Hovered..");
	}

	@When("^Clicks on \"(.*)\"$")
	public void clicks_on_(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    common.getproductPage(driver).click(element);
	    System.out.println(element +" Clicked..");
	    Thread.sleep(8000);
	}

	@Then("^User will be able to see \"(.*)\"$")
	public void user_will_be_able_to_see_(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    b=common.getproductPage(driver).isDetailDisplayed(element);
	    if(b=false)
	    {
	    	System.out.println(element +" Detail is not displayed");
	    }
	    System.out.println(element +" Details is displayed..");
	}

	
	
}
