package pages;

import base.Page;

public class HomePage extends Page {

	public void goToSupport() {

		click("support_XPATH");
	}

	public void goToSignUp() {

		click("signUp_XPATH");
	}

	public LoginPage goToLogin() {

		click("login_XPATH");
		return new LoginPage();
	}

	public void goToZohoEdu() {

	}
}
