@Sanity
Feature: user registration feature

  Scenario: Verify user is able to register an account
    Given I am on home page
    When I click on registration button
    Then I verify registration page is displayed
    When I enter all valid information on registration
    Then I verify registration successful message is displayed