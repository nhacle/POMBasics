package pages.crm.accounts;

import base.Page;

public class CreateAccountPage extends Page {

	public void createAccount(String keyToSend) {

		type("accountNameTxt_XPATH", keyToSend);
	}

}
