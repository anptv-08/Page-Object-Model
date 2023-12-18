package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.UtilityClass;

public class InputFormPage {
	public WebDriver driver;
	UtilityClass utility;
	
	By showMessageButton=By.xpath("//button[@id='button-one']");
	By inputFormLink=By.xpath("//div[@id='collapsibleNavbar']//ul//li[2]");


	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnInputForm() {
		WebElement element=driver.findElement(inputFormLink);
		element.click();
		
	}
	
	public String getButtonText() {
		WebElement element=driver.findElement(showMessageButton);
		utility=new UtilityClass();
		String idAttribure=utility.get_Attribute(element,"id");
		System.out.print("Id Attribute of ShowMessage Button:"+idAttribure);
		return element.getText();
	}

}
