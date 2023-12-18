package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import base.BaseClass;
import junit.framework.Assert;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablePage;

	@Test
	public void verifyHeadingOfTable() {
		tablePage = new TablePage(driver);
		tablePage.clickOnTableLink();
		String expectedHeading = "Table with Pagination Example";
		String actualHeading = tablePage.getTableHeading();
		Assert.assertEquals(actualHeading, expectedHeading);
	}
	
	@Test
	public void verifyTableHeading() {
		tablePage=new TablePage(driver);
		tablePage.clickOnTableLink();
		tablePage.getHeading();
		List<String> expectedHeading=new ArrayList<String>();
		expectedHeading=tablePage.getHeading();
		List<String> actualHeading=new ArrayList<String>();
		actualHeading.add("Name");
		actualHeading.add("Position");
		actualHeading.add("Office");
		actualHeading.add("Age");
		actualHeading.add("Start date");
		actualHeading.add("Salary");
		Assert.assertEquals(actualHeading, expectedHeading);
	}
	
	@Test
	public void verifyOfficeOfPerson() {
		tablePage=new TablePage(driver);
		tablePage.clickOnTableLink();
		tablePage.getPersonOffice("Cedric Kelly");
	}
}
