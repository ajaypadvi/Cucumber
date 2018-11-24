Feature: Application Login1
  @SmokeTest
  Scenario: Home page default login
    Given User is on net banking login page
    When User login to application with "jim" and "1234
    Then Home page is populated
    And Cards are displayed

  @SanityTest
  Scenario: Home page default login
    Given User is on net banking login page
    When User login to application with "john" and "4321"
    Then Home page is populated
    And Cards are not displayed

#Datatable example
  @RegressionTest
  Scenario: Home page default login
    Given User is on net banking login page
    When User signs up to application with following details
    |jenny|abcd|jenny@abcd.com|Sidney|78945513|
    Then Home page is populated
    And Cards are displayed

#Parameterization to run scenarios multiple time as per the Example inputs
  @SmokeTest
  Scenario Outline: Home page default login
    Given User is on net banking login page
    When User logs into application with <UserName> and <Password>
    Then Home page is populated
    And Cards displayed are "true"
    Examples:
      |UserName  | Password |
      |user1  | pwd1 |
      |user2  | pwd2 |
      |user3  | pwd3 |
      |user4  | pwd4 |
      |user5  | pwd5 |