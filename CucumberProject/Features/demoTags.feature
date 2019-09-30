@FunctionalTest
Feature: Tags functionality
  To tset tags functionality

  Background: Background Functionality
    Given Test one Background
    When Test two Background
    Then Test three Background

  @SmokeTest
  Scenario: Test smoke Functionality
    Given Its a smoke first test
    When Its a smoke second test
    Then Its a smoke third test

  @RegressionTest
  Scenario: Test Regression Functionality
    Given Its a Regression first test
    When Its a Regression second test
    Then Its a Regression third test

  @IntegrationTest
  Scenario: Test Integration Functionality
    Given Its a Integration first test
    When Its a Integration second test
    Then Its a Integration third test
