package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class LoginPage {
	@FindBy(how = How.NAME, using = "user")
	public WebElement txt_userName;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement txt_password;
	
	@FindBy(how = How.CLASS_NAME, using = "css-y3nv3e-button")
	public WebElement btn_login;
	
	@FindBy(how = How.CSS, using = "a[class='css-1d9e5zy-button']")
	public WebElement btn_skip;
	
}
