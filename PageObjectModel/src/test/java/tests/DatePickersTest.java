package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass{
	DatePickersPage datePickersPage;
	
	
	@Test
	public void verifyDatePicker() {
		datePickersPage=new DatePickersPage(driver);
		datePickersPage.clickOnDatePickers();
		//datePickersPage.chooseDate();
		datePickersPage.chooseDateSendKeys("23/12/2000");
	}
	
	
}
