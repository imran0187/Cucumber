@Smoke
Feature: Login feature

  Scenario: login with valid credential
    Given I am on home page
    When I click on login button
    And I enter following details for login
      | userName   | passWord |
      | imran0187  | 321321   |
      | samira0187 | password |
    And I click on submit button
    Then I verify profile page is displayed


  Scenario Outline: login with invalid user id and password
    Given I am on home page
    When I click on login button
    And I enter enter invalid user name as <userName> and password as <passWord>
    And I click on submit button
    Then I verify profile page is not displayed

    Examples:
      | userName      | passWord    |
      | invalidImran  | invalid1234 |
      | invalidUserId | invalidPass |

