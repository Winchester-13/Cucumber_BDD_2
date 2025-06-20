Feature: Login

  Scenario: Login multiple times
  
    Given the user opens the website
    When the user enters username "helloworld_123@gmail.com" and password "tutorial"
    When the user clicks on the login button
    Then user should see the welcome message
