package PageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	
	@FindBy(how = How.NAME, using = "Clear")
	public WebElement btn_Clear;
	
	@FindBy(how = How.NAME, using = "One")
	public WebElement btn_One;
	
	@FindBy(how = How.NAME, using = "Plus")
	public WebElement btn_Plus;
	
	@FindBy(how = How.NAME, using = "Seven")
	public WebElement btn_Seven;
	
	@FindBy(how = How.NAME, using = "Equals")
	public WebElement ban_Equals;
	
	@FindBy(how = How.XPATH, using = "//*[@AutomationId='CalculatorResults']")
	public WebElement field_result;
	
}
