Feature: Test login Functionality

  Scenario Outline: Check login is sucessfully with Valid Credentials
    Given brower is open
    And user is on login page
    When user enter <username> and <password>
    And user clicks on login
    Then user is navigated to home page

    Examples: 
      | username              | password |
      | geethusurai@gmail.com |    12345 |
      | jsdf@gmail.com        |   123457 |
