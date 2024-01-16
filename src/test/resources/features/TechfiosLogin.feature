@TechFiosLoginFeature @Regression
Feature: Techfios billing page login functionality validation

  Background: 
    Given User is on the Codefios Login Page
    When User eneters the username as "demo@codefios.com"

  @LoginScenario1 @Sanity
  Scenario: User should be able to login with valid credentials
    When User enters the Password as "abc123"
    And User clicks on SignIn button
    Then User should be able to land on Dashboard Page

  @LoginScenario2 
  Scenario: User should not be able to login with invalid credentials
    When User enters the Password as "abc124"
    And User clicks on SignIn button
    Then User should be able to land on Dashboard Page
