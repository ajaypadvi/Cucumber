Feature: Application Login2

#Datatable example
  @SanityTest
  Scenario: Home page default login
    Given User is on net banking login page
    When User signs up to application with following details
    |jenny|abcd|jenny@abcd.com|Sidney|78945513|
    Then Home page is populated
    And Cards are displayed

