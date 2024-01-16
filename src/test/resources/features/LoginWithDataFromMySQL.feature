@DataFromMySqlFeature @Regression
Feature: Techfios billing page login functionality validation

  Background: 
    Given User is on the Codefios Login Page

  @DbScenario1 @Smoke
  Scenario: User should be able to login with valid credentials
    When User enters "username" from mySql database
    When User enters "password" from mySql database
    And User clicks on SignIn button
    Then User should be able to land on Dashboard Page
