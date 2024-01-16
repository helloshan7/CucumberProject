package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DataBasePage;
import pages.ListAccountPage;
import pages.LoginPage;
import pages.TestBase;

public class StepDefinition extends TestBase {
	LoginPage loginPage;
	DataBasePage databasePage;
	ListAccountPage listAccountPage;
	
	
	

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DataBasePage();
		listAccountPage = PageFactory.initElements(driver, ListAccountPage.class);
		
	}

	@Given("User is on the Codefios Login Page")
	public void user_is_on_the_codefios_login_page() {
		driver.get("https://qa.codefios.com/login");

	}

	@When("User eneters the username as {string}")
	public void userEnetersTheUsername(String username) {
		loginPage.insertUserName(username);
	}

	@When("User enters the Password as {string}")
	public void user_enters_the_Password_as(String password) {
		loginPage.insertPassword(password);
	}

	@When("User enters {string} from mySql database")
	public void user_enters_from_mySql_database(String loginData) {
//		if (loginData.equalsIgnoreCase("username")) {
//
//		} else if (loginData.equalsIgnoreCase("password")) {
//
//		} else {
//
//		}

	  switch(loginData) {
	  case "username":
		  loginPage.insertUserName(databasePage.getDataFromDataBase("user_name"));
		  break;
		  
	  case "password":
		  loginPage.insertPassword(databasePage.getDataFromDataBase("user_password"));
	  break;
	  
	  default :
		  
		  System.out.println("Unable to find login data;" + loginData);
	  
	  
	  
	  }
	}

	@When("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		loginPage.clickOnSigninButton();
	}

	@When("User should be able to land on Dashboard Page")
	public void user_should_be_able_to_land_on_Dashboard_Page() {
		String expectedTitle = "Codefios QA";
		String actualTitle = loginPage.getPageTitle();
		takeScreenshot(driver);
		Assert.assertEquals("Page titles not matching", expectedTitle, actualTitle);
	}
	
	@When("User clicks on list accounts tab on dashboard page")
	public void user_clicks_on_list_accounts_tab_on_dashboard_page() {
		listAccountPage.clickOnListAccountTab();
	}
	

	@When("User clicks on add account tab")
	public void user_clicks_on_add_account_tab() {
		listAccountPage.clickOnAddAccountTab();
	}
	
	@When("User enters account name {string}")
	public void user_enters_account_name(String accountName) {
		listAccountPage.enterAccountName(accountName);
	}
	
	@When("User writes description {string}")
	public void user_writes_description(String desc) {
		listAccountPage.enterDescription(desc);	
	}
	
	@When("User enters initial balance {string}")
	public void user_enters_initial_balance(String int1) {
		listAccountPage.enterInitialBalance(int1);
	}
	
	@When("User enters A\\/C number {string}")
	public void user_enters_A_C_number(String int2) {
		listAccountPage.enterAccountNumber(int2);
	}
	
	
	
	@And("User enters contact person {string}")
	public void user_enters_contact_person(String contactPerson) {
		listAccountPage.enterContactPerson(contactPerson);
	}
	

	@Then("User clicks on save button")
	public void user_clicks_on_save_button() {
		listAccountPage.clickOnSaveButton();
		takeScreenshot(driver);
	}

	@Then("User should be able to see the success alert popUp")
	public void user_should_be_able_to_see_the_success_alert_popUp() {
		listAccountPage.userVerifiesAlertPopUp("Alert Message not displayed");

	}

	
	
//	@After
	public void tearDown() {

		driver.close();
		driver.quit();
	}

}