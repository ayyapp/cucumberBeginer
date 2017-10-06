Feature: Verify features of DemoQA HomePage
  
  Scenario Ouline: Verify detail of first carousel
  
  Given : User is at DemoQA HomePage
  When : User clicks on <carousel> dot
  And : Waits for the product detail
  Then : <product> detail with image is displayed
  
  Example:
  |	carousel	||	product								|
  | first			||	magic mouse						|
  | second		||	iPhone 5							|
  | thrd			||	iPod Nano Blue				|
