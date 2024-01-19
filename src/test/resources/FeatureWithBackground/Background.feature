Feature: Check Home Page Functionality

  Background: user is logged in
    Given user is on login page
    When user enter username and password
    Then clicks on login button
    And user is navigated to homepage

  Scenario: Check logout link
    When user clicks on welcome page
    Then logout link is displayed

  Scenario: Verify quick launch toollbar is present
    When user clicks on dashboard page
    Then quick launch toollbar is displayed
