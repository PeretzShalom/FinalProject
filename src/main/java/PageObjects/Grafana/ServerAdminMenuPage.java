package PageObjects.Grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServerAdminMenuPage
{
    @FindBy(how = How.XPATH, using = "//div[*]/div[7]/ul/li[2]/a")
    public WebElement link_users;

    @FindBy(how = How.XPATH, using = "//div[*]/div[7]/ul/li[3]/a")
    public WebElement link_orgs;

    @FindBy(how = How.XPATH, using = "//div[*]/div[7]/ul/li[4]/a")
    public WebElement link_settings;

    @FindBy(how = How.XPATH, using = "//div[*]/div[7]/ul/li[5]/a")
    public WebElement link_stats;

    @FindBy(how = How.XPATH, using = "//div[*]/div[7]/ul/li[6]/a")
    public WebElement link_upgrade;
}
