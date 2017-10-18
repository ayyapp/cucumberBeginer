Feature: Verify features of DemoQA HomePage
	@TC1 
  Scenario Outline: Verify Home Page Links
    Given User is at DemoQA HomePage
    When User verifies the "home" page
    Then "<links>" Link is present:

    Examples: 
      | links            |
      | Home             |
      | Product Category |
      | All Product      |
      | item checkout    |
      | My Account       |  
