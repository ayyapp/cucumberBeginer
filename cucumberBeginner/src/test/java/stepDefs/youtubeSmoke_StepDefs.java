package stepDefs;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class youtubeSmoke_StepDefs {

	
	static WebDriver driver;
	boolean b;
	@SuppressWarnings("unused")
	private base common;
	public youtubeSmoke_StepDefs(base common) {
		// TODO Auto-generated constructor stub
		this.common=common;
	}
	
	
	@Given("^User has landed in youtube homepage$")
	public void user_has_landed_in_youtube_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^User is on utube landing page$")
	public void user_is_on_utube_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User taps on trending image$")
	public void user_taps_on_trending_image() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Trending related videos are shown$")
	public void trending_related_videos_are_shown() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Account Page is displayed$")
	public void account_Page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user taps on three dots for options$")
	public void user_taps_on_three_dots_for_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Below values are displayed:$")
	public void below_values_are_displayed(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}
}
