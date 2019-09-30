@TestMeAPP
Feature: Login Functionality

  @SmokeTesting
  Scenario: Login Functionality with valid credentials
    Given User is on Home Page
    When user enters username and password
    Then user logged in successfully
    
 
