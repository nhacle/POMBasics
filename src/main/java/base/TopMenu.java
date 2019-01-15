package base;

import org.openqa.selenium.WebDriver;

import pages.crm.accounts.AccountsPage;

public class TopMenu {

	WebDriver driver;

	public TopMenu(WebDriver driver) {

		this.driver = driver;
	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() {

		Page.click("account_XPATH");

		return new AccountsPage();
	}

	public void goToDeals() {

	}

	public void goToActivities() {

	}

	public void goToReports() {

	}

	public void goToAnalytics() {

	}

	public void goToProducts() {

	}

	public void goToQuotes() {

	}

	public void goToFeeds() {

	}
}
