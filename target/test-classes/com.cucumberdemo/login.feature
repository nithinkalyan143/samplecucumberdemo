Feature: login to ninja application
  @Smoketesting
  Scenario: login with valid credentials
    Given user opened chrome browser and entered url
    When user entered username and password
    And User clicked on login
    Then user needs to land on login page
   @RegressionTest
  Scenario Outline: login with valid credentials
    Given user opened chrome browser and entered url
    When user entered <username> and <password>
    And User clicked on login
    Then user needs to land on login page
    Examples:
    |chaitanya@gmail.com| Vipparla@143|
    | hsjkfhjkf         | njfnjkvnfk  |