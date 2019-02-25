Feature: User is going to test youtube smoke functionality
Description: The purpose of this feature is to test smoke for mobile you tube

Background: User has launched youtube
	Given User has landed in youtube homepage


  Scenario: User should be able to check a dry run on youtube
    Given User is on utube landing page
    When User taps on trending image
    Then Trending related videos are shown
    When User taps on trending image
    Then Account Page is displayed
    When user taps on three dots for options
    Then Below values are displayed:
   	  |Sign In	   |          
      |Help        | 
      |Dsktop      | 
      |Cancel      | 

    
