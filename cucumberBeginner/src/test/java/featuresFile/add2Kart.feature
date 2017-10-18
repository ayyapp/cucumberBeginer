Feature: User is able to add2Kart and purchase the item

@TC2
  Scenario: User should be able to add an item to kart and prchase it
    Given User is at DemoQA HomePage
    When User clicks on "All Products"
    And Clicks on "Add to cart" button
    And Waits and clicks on "Checkout"
    Then User should be able to view the item added

     And User is at Checkout page
    When User clicks on "Continue" button
    And Enters the user details:
      | Fields     | values              |
      | First Name | Tom                 |
      | Last Name  | Kenny               |
      | Address    | someone@someone.com |
      | City       | someone@someone.com |
      
    And Clicks on "same as billing address" checkbox
    Then Click on "purchase" button
