Feature: Application Login

  Scenario: Home page default login
    Given User is on net banking login page
    When User login to application with "jim" and "1234
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login
    Given User is on net banking login page
    When User login to application with "john" and "4321"
    Then Home page is populated
    And Cards are not displayed