package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsAndModalsPage {

	WebDriver driver;
	By alertAndModalslink=By.xpath("//div[@id='collapsibleNavbar']//ul//li[6]");
	By bootStrapAlertHeading=By.xpath("//div[contains(text(),'Bootstrap Alert')]");
	public AlertsAndModalsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnAlertsAndModalPage() {
		WebElement element=driver.findElement(alertAndModalslink);
		element.click();
	}
	
	public String getBootStrapAlertHeading() {
		WebElement element=driver.findElement(bootStrapAlertHeading);
		return element.getText();
	}
	
}
