Feature: User is able to search and play songs in you tube
Description: The purpose of this feature is to test search and play functionality in you tube

Background: User has launched youtube
	Given User has landed in youtube homepage


  Scenario: User should be able to search a video
    Given User is on utube landing page
    When User enters "Football" in search box
    And taps on any suggested option
    And User able to see list of all videos related to search
    
   Scenario: User should be able to search a video
    Given User is on utube landing page
    When User enters "Football" in search box
    And taps on any suggested option
    And User able to see list of all videos related to search
    And User taps on any listed videos
    Then User is taking to video detail page
        

    
