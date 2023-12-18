package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {

	WebDriver driver;
	
	@FindBy(xpath="//div[@id='collapsibleNavbar']//ul//li[3]")
	WebElement datePickersLink;
	
	@FindBy(xpath="//input[@id='single-input-field']")
	WebElement enterDateInputField;
	
	@FindBy(xpath="(//table[@class='table-condensed']//th[@class='prev'])[1]")
	WebElement prevElement;
	
	@FindBy(xpath="(//table[@class='table-condensed']//th[@class='next'])[1]")
	WebElement nextElement;
	
	@FindBy(xpath="(//table[@class='table-condensed']//th[@class='datepicker-switch'])[1]")
	WebElement monthElement;
	
	public DatePickersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnDatePickers() {
		datePickersLink.click();
	}
	
	public void chooseDate() {
		enterDateInputField.click();
		String date="24/12/2023";
		String arr[]=date.split("/");
		String day=arr[0];
		String monthIndex=arr[1];
		String year=arr[2];
		String month="";
		int m=Integer.parseInt(monthIndex);
		int y=Integer.parseInt(year);
		switch (m) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
		}
		String month_Year=month+" "+year;
		while(true) {
			String currentMonth=monthElement.getText();
			if(currentMonth.equals(month_Year)) {
				break;
			}
			else if(m<12 && y<=2023) {
				prevElement.click();
			}
			else if(y>2023) {
				nextElement.click();
			}
		}
		WebElement dayElement=driver.findElement(By.xpath("//table//tbody//tr//td[contains(text(),'"+day+"') and @class='day']"));
		dayElement.click();
	}
	
	public void chooseDateSendKeys(String date) {
		enterDateInputField.sendKeys(date);
	}
}
