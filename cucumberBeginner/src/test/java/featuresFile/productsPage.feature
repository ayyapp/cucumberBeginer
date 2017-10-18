Feature: Verify Product Category Page
@TC3 @TC1
  Scenario Outline: User should be able to view respective Items on selecting a product in its category.
    Given User is at DemoQA HomePage
    When User hovers over "Product Category" link
    And Clicks on "<subItem>"
    Then User will be able to see "<details>"

    Examples: 
      | subItem     |  | details     |
      | Accessories |  | Accessories |
      | iMacs       |  | iMacs       |
      | iPads       |  | iPads       |
