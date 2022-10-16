Feature: login to ninja application
  Scenario: login with valid credentials
    Given user opened chrome browser and entered url
    When user entered username and password
    And User clicked on login
    Then user needs to land on login page