@FunctionalTest
Feature: Login functionality

  @SmokeTest
  Scenario: Test HerokuApp login
    Given user is on HerokuApp page
    When user enters username and password in herokuapp
      | tomsmith | SuperSecretPassword! |
    Then display message user logged in successful
