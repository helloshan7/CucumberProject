@OtherLoginFeature @Regression
Feature: Other Techfios billing page login functionality validation

Background:
Given User is on the Codefios Login Page

@OtherScenario1 @Sanity
Scenario Outline: User should be able to login with valid credentials
When User eneters the username as "<username>"
When User enters the Password as "<Password>"
And User clicks on SignIn button
Then User should be able to land on Dashboard Page

Examples:
|username          |Password|
|demo@codefios.com |abc124  |
|1demo@codefios.com|abc123  |
|1demo@codefios.com|abc124  |
|                  |        |















#@OtherScenario2 @Smoke
#Scenario: User should not be able to login with invalid credentials
#When User eneters the username as "demo@codefios.com"
#When User enters the Password as "abc124"
#And User clicks on SignIn button
#Then User should be able to land on Dashboard Page
#
#@OtherScenario3
#Scenario: User should not be able to login with invalid credentials
#When User eneters the username as "1demo@codefios.com"
#When User enters the Password as "abc123"
#And User clicks on SignIn button
#Then User should be able to land on Dashboard Page
#
#@OtherScenario4
#Scenario: User should not be able to login with invalid credentials
#When User eneters the username as "1demo@codefios.com"
#When User enters the Password as "abc124"
#And User clicks on SignIn button
#Then User should be able to land on Dashboard Page
#
#@OtherScenario5 @Smoke
#Scenario: User should not be able to login with invalid credentials
#When User eneters the username as ""
#When User enters the Password as ""
#And User clicks on SignIn button
#Then User should be able to land on Dashboard Page