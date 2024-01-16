package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ListAccountPage extends TestBase {

	WebDriver driver;

	public ListAccountPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')]")
	WebElement listAccountElement;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div[1]/div/div[2]/header/button")
	WebElement addAccountElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_name\"]")
	WebElement enterAccountNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement enterDescriptionElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement enterInitialBalanceElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement enterAccountNumberElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement enterContactPersonElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"accountSave\"]")
	WebElement clickOnSaveButtonElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"tBody\"]")
	WebElement verifyAccountNumberElement;
	@FindBy(css="#toast-container")
	WebElement popUpMsg;

	public void clickOnListAccountTab() {
		listAccountElement.click();

	}

	public void clickOnAddAccountTab() {
		addAccountElement.click();

	}

	public void enterAccountName(String accountName) {
		enterAccountNameElement.sendKeys(accountName);

	}

	public void enterDescription(String desc) {
		enterDescriptionElement.sendKeys(desc);

	}

	public void enterInitialBalance(String int1) {
		enterInitialBalanceElement.sendKeys(String.valueOf(int1));

	}

	public void enterAccountNumber(String int2) {
		enterAccountNumberElement.sendKeys(String.valueOf(int2));

	}

	public void enterContactPerson(String contactPerson) {
		enterContactPersonElement.sendKeys(contactPerson);
	}

	public void clickOnSaveButton() {
		clickOnSaveButtonElement.click();
	}

	public void userVerifiesAlertPopUp(String msg) {
	
		TestBase.validatePopUpMessageElement(msg, popUpMsg);
		
		
	}

	
}
