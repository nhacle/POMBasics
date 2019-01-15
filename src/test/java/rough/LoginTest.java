package rough;

import base.Page;
import pages.HomePage;
import pages.LoginPage;
import pages.ZohoAppPage;
import pages.crm.accounts.AccountsPage;
import pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {

		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();

		ZohoAppPage zp = lp.doLogin("nguyennhac2904@gmail.com", "Nguyennhac2904");
		zp.closePopup();
		zp.goToCRM();

		AccountsPage account = Page.menu.goToAccounts();

		CreateAccountPage cap = account.goToCreateAccounts();

		cap.createAccount("Wayne Rooney");

	}

}
