package pages;

import base.Page;

public class LoginPage extends Page {

	public ZohoAppPage doLogin(String username, String password) {

		// driver.switchTo().window("https://accounts.zoho.com");
		type("username_XPATH", username);
		type("password_XPATH", password);
		click("signIn_XPATH");

		return new ZohoAppPage();
	}
}
