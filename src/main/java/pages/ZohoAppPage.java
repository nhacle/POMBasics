package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Page;
import pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	public void goToCalendar() {

		driver.findElement(By.xpath("//*[contains(text(), 'Calendar')]//ancestor::a")).click();
	}

	public void goToCliq() {

		driver.findElement(By.xpath("//*[contains(text(), 'Cliq')]//ancestor::a")).click();
	}

	public void goToConnect() {

		driver.findElement(By.xpath("//*[contains(text(), 'Connect')]//ancestor::a")).click();
	}

	public CRMHomePage goToCRM() {

		click("crm_XPATH");

		return new CRMHomePage();
	}

	public void goToDesk() {

		driver.findElement(By.xpath("//*[contains(text(), 'Desk')]//ancestor::a")).click();
	}

	public void goToMail() {

		driver.findElement(By.xpath("//*[contains(text(), 'Mail')]//ancestor::a")).click();
	}

	public void goToPeople() {

		driver.findElement(By.xpath("//*[contains(text(), 'People')]//ancestor::a")).click();
	}

	public void closePopup() {

		wait = new WebDriverWait(driver, 10);
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//*[contains(@class, 'bubble-container _animate')]//button[contains(text(), 'Close')]")));
		click("popup_XPATH");
	}
}
