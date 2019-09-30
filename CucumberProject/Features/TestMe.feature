@FunctionalTest
Feature: To test multiple login functionality on TestMeApp

  @SmokeTest
  Scenario Outline: Test multiple login functionality on TestMeApp
    Given user is on TestMeApp Page
    When User enters "<username>" and "<password>"
    Then Display message Loggedin successfully

    Examples: 
      | username  | password    |
      | Lalitha   | Password123 |
      | Pratiksha |       12345 |
