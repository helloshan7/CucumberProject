$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/ListAccountsData.feature");
formatter.feature({
  "name": "User should be able to add account under list account tab on dashboard page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddAccountFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to add account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddAccountScenario1"
    }
  ]
});
formatter.step({
  "name": "User clicks on list accounts tab on dashboard page",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on add account tab",
  "keyword": "When "
});
formatter.step({
  "name": "User enters account name \"\u003caccountName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User writes description \"\u003cdescription\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters initial balance \"\u003cinitialBalance\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters A/C number \"\u003caccountNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters contact person \"\u003ccontactPerson\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on save button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to see the success alert popUp",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountName",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson"
      ]
    },
    {
      "cells": [
        "MyName",
        "Sample",
        "500.00",
        "23456789",
        "MySelf"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Codefios Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_on_the_codefios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"username\" from mySql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_from_mySql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"password\" from mySql database",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_from_mySql_database(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on SignIn button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_SignIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to land on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_land_on_Dashboard_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to add account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddAccountFeature"
    },
    {
      "name": "@AddAccountScenario1"
    }
  ]
});
formatter.step({
  "name": "User clicks on list accounts tab on dashboard page",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_list_accounts_tab_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add account tab",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_add_account_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters account name \"MyName\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_account_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User writes description \"Sample\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_writes_description(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initial balance \"500.00\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_initial_balance(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters A/C number \"23456789\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_A_C_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contact person \"MySelf\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_contact_person(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on save button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.user_clicks_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to see the success alert popUp",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_be_able_to_see_the_success_alert_popUp()"
});
formatter.result({
  "status": "passed"
});
});