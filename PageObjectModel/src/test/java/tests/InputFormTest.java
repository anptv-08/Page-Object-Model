package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.InputFormPage;
import utility.UtilityClass;

public class InputFormTest extends BaseClass {
	InputFormPage inputFormPage;
	
	SoftAssert softassert=new SoftAssert();

	@Test
	public void verifyShowMessageButtonText() {
		inputFormPage = new InputFormPage(driver);
		inputFormPage.clickOnInputForm();
		String expectedText="Show Message";
		String actualText=inputFormPage.getButtonText();
		softassert.assertEquals(actualText, expectedText);
		softassert.assertAll();
	}
}
