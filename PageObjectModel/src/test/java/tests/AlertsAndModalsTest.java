package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import junit.framework.Assert;
import pages.AlertsAndModalsPage;

public class AlertsAndModalsTest extends BaseClass {

	AlertsAndModalsPage alertsAndModalsPage;
	SoftAssert softassert=new SoftAssert();
	@Test
	public void verifyAlertHeadings() {
		alertsAndModalsPage=new AlertsAndModalsPage(driver);
		alertsAndModalsPage.clickOnAlertsAndModalPage();
		String expectedHeading="Bootstrap Alert";
		String actualHeading=alertsAndModalsPage.getBootStrapAlertHeading();
		softassert.assertEquals(actualHeading, expectedHeading);
		softassert.assertAll();
	}
}
