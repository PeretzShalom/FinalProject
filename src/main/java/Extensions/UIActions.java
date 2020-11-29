package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class UIActions extends CommonOps {
	@Step("Click on elements")
	public static void click(WebElement elem) {
		if (!platform.equalsIgnoreCase("mobile") &&
				!platform.equalsIgnoreCase("electron") &&
				!platform.equalsIgnoreCase("desktop"))
			wait.until(ExpectedConditions.elementToBeClickable(elem));
		elem.click();
	}
	
	@Step("Update text in elements")
	public static void UpdateText(WebElement elem, String value) {
		if (!platform.equalsIgnoreCase("mobile"))
			wait.until(ExpectedConditions.visibilityOf(elem));
		elem.sendKeys(value);
	}
	
	@Step("Update drop-down field")
	public static void UpdateDropDown(WebElement elem, String value) {
		if (!platform.equalsIgnoreCase("mobile"))
			wait.until(ExpectedConditions.visibilityOf(elem));
		Select myValue = new Select(elem);
		myValue.selectByVisibleText(value);
	}
	
	@Step("mouse hover on elements")
	public static void MouseHoverElements(WebElement elem1, WebElement elem2) {
		action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
	}
}
