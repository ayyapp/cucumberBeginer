package stepDefs;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class youtube_SearchAndPlay_StepDefs {

	
	static WebDriver driver;
	boolean b;
	@SuppressWarnings("unused")
	private base common;
	public youtube_SearchAndPlay_StepDefs(base common) {
		// TODO Auto-generated constructor stub
		this.common=common;
	}
	
	@When("^User enters \"([^\"]*)\" in search box$")
	public void user_enters_in_search_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^taps on any suggested option$")
	public void taps_on_any_suggested_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^User able to see list of all videos related to search$")
	public void user_able_to_see_list_of_all_videos_related_to_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("^User taps on any listed videos$")
	public void user_taps_on_any_listed_videos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User is taking to video detail page$")
	public void user_is_taking_to_video_detail_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
