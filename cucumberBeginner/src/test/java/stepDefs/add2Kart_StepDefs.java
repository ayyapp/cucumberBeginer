package stepDefs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.utilityMethods;

public class add2Kart_StepDefs
{
	static WebDriver driver;
	boolean b;
	private base common;
	public add2Kart_StepDefs(base common) {
		// TODO Auto-generated constructor stub
		this.common=common;
	}
	
	
	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=hooks.getDriver();
	    common.getallProduct(driver).click(element);
	}

	@When("^Clicks on \"([^\"]*)\" button$")
	public void clicks_on_button(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 common.getallProduct(driver).click(element);
		 
	}

	@When("^Waits and clicks on \"([^\"]*)\"$")
	public void waits_and_clicks_on(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(10000);
	    common.getallProduct(driver).click(element);
	    
	}

	@Then("^User should be able to view the item added$")
	public void user_should_be_able_to_view_the_item_added() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String itemNm=common.getCheckoutPage(driver).itemNm();
	    System.out.println("Item Name is "+itemNm);
	}

	@Then("^User is at Checkout page$")
	public void user_is_at_Checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("User is at checkout page");
	}

	@When("^User clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    common.getCheckoutPage(driver).click(element);
	}

	@When("^Enters the user details:$")
	public void enters_the_user_details(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		utilityMethods.scrollByWindow(driver, 0, 350);
	    java.util.List<java.util.List<String>> data=table.raw();
	    common.getCheckoutPage(driver).getElement("First Name").sendKeys(data.get(1).get(1));
	    common.getCheckoutPage(driver).getElement("Last Name").sendKeys(data.get(2).get(1));
	    common.getCheckoutPage(driver).getElement("Address").sendKeys(data.get(3).get(1));
	    common.getCheckoutPage(driver).getElement("City").sendKeys(data.get(4).get(1));
	}

	@When("^Clicks on \"([^\"]*)\" checkbox$")
	public void clicks_on_checkbox(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   common.getCheckoutPage(driver).click(element);
	}

	@Then("^Click on \"([^\"]*)\" button$")
	public void click_on_purchase_button(String element) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		common.getCheckoutPage(driver).click(element);
	}
	
	
	
}
