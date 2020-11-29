package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserListPage {
	@FindBy(how = How.CSS, using = "input[name='name']")
	public WebElement Text_name;
	
	@FindBy(how = How.CSS, using = "input[name='email']")
	public WebElement Text_Email;
	
	@FindBy(how = How.CSS, using = "input[name='login']")
	public WebElement Text_UserName;
	
	@FindBy(how = How.CSS, using = "input[name='password']")
	public WebElement Text_Pass;
	
	@FindBy(how = How.CSS, using = "button[type='submit']")
	public WebElement Btn_CreateUser;
	/*String TextBtn= Btn_CreateUser.getText();*/
	
	@FindBy(how = How.XPATH, using = "//span[text()='Delete User']")
	public WebElement Btn_Delete;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Delete user']")
	public WebElement Btn_ConfirmDelete;
	
}
