package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtilityClass {

	public String get_Attribute(WebElement element, String attribute) {
		return element.getAttribute(attribute);
	}

	public List<String> getTextOfElements(List<WebElement> elements) {
		List<String> textOfElement = new ArrayList<String>();
		for (WebElement element : elements) {
			textOfElement.add(element.getText());
		}
		return textOfElement;
	}

}
