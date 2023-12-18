package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass{
HomePage homePage;
	@Test
	public void verifyLogoIsPresent() {
		homePage=new HomePage(driver);
		System.out.print("Title: "+driver.getTitle());
		homePage.isLogoDisplayed();
	}
}
