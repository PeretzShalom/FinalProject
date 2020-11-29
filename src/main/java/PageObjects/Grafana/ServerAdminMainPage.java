package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {
	@FindBy(how = How.CSS, using = "td[class='width-4 text-center link-td']")
	public List<WebElement> rows;
	
	@FindBy(how = How.CSS, using = "a[class='css-1ihbihm-button']")
	public WebElement Btn_NewUser;
	
}
