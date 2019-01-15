package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import base.Page;
import pages.ZohoAppPage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;
import utilities.Utilities;

public class CreateAccountTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPage zp = new ZohoAppPage();
		zp.closePopup();

		zp.goToCRM();

		AccountsPage ap = Page.menu.goToAccounts();

		CreateAccountPage cap = ap.goToCreateAccounts();

		cap.createAccount(data.get("accountname"));
	}
}
