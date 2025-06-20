Feature: Login

  Scenario: Login multiple times
    Given the user opens the website
    When the user enters username "asad13jan" and password "qwertyuiop"
    When the user clicks on the login button
    Then user should see the welcome message
