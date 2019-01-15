package pages.crm.accounts;

import base.Page;

public class AccountsPage extends Page {

	public CreateAccountPage goToCreateAccounts() {

		click("createAccBtn_XPATH");

		return new CreateAccountPage();
	}

	public void goToImportAccounts() {

	}
}
