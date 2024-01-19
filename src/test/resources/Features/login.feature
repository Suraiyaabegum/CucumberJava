#Author
#Date
#Description
@Smokefeature
Feature: feature to test the login functionality

  @Smoketest
  Scenario: Check login is successful with Valid Credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is Navigated to the home page
