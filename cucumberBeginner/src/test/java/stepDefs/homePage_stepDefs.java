package stepDefs;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class homePage_stepDefs 
{
	
	static WebDriver driver;
	boolean b;
	private base common;
	
	public homePage_stepDefs(base common) {
		// TODO Auto-generated constructor stub
		this.common=common;
	
	
	}
	
	
	/*@Given("^User is at \"([^\"]*)\" HomePage$")
	public void user_is_at_DemoQA_HomePage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String title=driver.getTitle();
	    if(title.contains("ONLINE STORE"))
	    {
	    	System.out.println("User is at DemoQA Home Page");
	    }
	    else
	    {
	    	Assert.fail("User is not at home page instead it is in "+title);
	    }
	}*/

	@When("^User verifies the \"(.*)\" page$")
	public void user_verifies_the_home_page(String page) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=hooks.getDriver();
		String s=common.getHomePage(driver).checkHomePage();
		System.out.println("User is at HomePage with title "+s);
	    
	}

	@Then("^\"([^\"]*)\" Link is present:$")
	public void home_Link_is_present(String link) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		b=common.getHomePage(driver).isElementPresent(link);
		if(b=true)
		{
			System.out.println(link +"is Present");
		}
		else
		{
			Assert.fail(link +"is not present");
		}
	}

	/*@Then("^Product Category Link is present:$")
	public void product_Category_Link_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	/*@Then("^All Product Link is present:$")
	public void all_Product_Link_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	/*@Then("^item checkout Link is present:$")
	public void item_checkout_Link_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/

	/*@Then("^My Account Link is present:$")
	public void my_Account_Link_is_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
	
	
	

}
