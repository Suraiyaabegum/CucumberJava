Feature: check login functionality
@smoke
  Scenario Outline: 
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
   
    
  Scenario Outline: 
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page