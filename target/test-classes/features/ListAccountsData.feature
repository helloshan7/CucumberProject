@AddAccountFeature
Feature: User should be able to add account under list account tab on dashboard page

Background: 
    Given User is on the Codefios Login Page
    When User enters "username" from mySql database
    When User enters "password" from mySql database
    And User clicks on SignIn button
    Then User should be able to land on Dashboard Page

  @AddAccountScenario1
Scenario Outline: User should be able to add account
    When User clicks on list accounts tab on dashboard page
    When User clicks on add account tab
    When User enters account name "<accountName>"
    When User writes description "<description>"
    When User enters initial balance "<initialBalance>"
    When User enters A/C number "<accountNumber>"
    When User enters contact person "<contactPerson>"
    And User clicks on save button
    Then User should be able to see the success alert popUp
    
    
Examples:
    |accountName|description|initialBalance|accountNumber|contactPerson|
    |MyName     |Sample     |  500.00      |23456789     |MySelf       |