package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.UtilityClass;

public class TablePage {

	WebDriver driver;
	UtilityClass utilityClass;
	@FindBy(xpath = "//div[@id='collapsibleNavbar']//ul//li[4]")
	WebElement tableLink;

	@FindBy(xpath = "//div[contains(text(),'Table with Pagination Example')]")
	WebElement tableHeading;

	@FindBy(xpath = "//table[@id='dtBasicExample']//thead//tr[1]//th")
	List<WebElement> tableHeadings;

	@FindBy(xpath = "//table[@id='dtBasicExample']//tbody//tr//td[1]")
	List<WebElement> nameData;

	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnTableLink() {
		tableLink.click();
	}

	public String getTableHeading() {
		return tableHeading.getText();
	}

	public List<String> getHeading() {
		utilityClass = new UtilityClass();
		List<String> headings = utilityClass.getTextOfElements(tableHeadings);
		return headings;
//		for(String heading: headings) {
//			System.out.println("Table Heading: "+heading);
//		}	
	}

	public void getPersonOffice(String name) {
		utilityClass = new UtilityClass();
		List<String> personNames = utilityClass.getTextOfElements(nameData);
		int index = 0;
		for (index = 0; index < personNames.size(); index++) {

			if (name.equals(personNames.get(index))) {
				index++;
				break;
			}
		}
		WebElement office = driver
				.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[" + index + "]//td[3]"));
		System.out.println("Office: " + office.getText());
	}
}
