Feature: feature to test the google search functionality

  Scenario Outline: validate google search is working
    Given browser is open
    And user is on user google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
