package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends Base {
	public static void init() {
		
		/*-----------------Web---------------*/
		
		grafanaLogin = PageFactory.initElements(driver, PageObjects.Grafana.LoginPage.class);
		
		grafanaMain = PageFactory.initElements(driver, PageObjects.Grafana.mainPage.class);
		
		grafanaLeftMenu = PageFactory.initElements(driver, PageObjects.Grafana.LeftMenuPage.class);
		
		grafanaServerAdminMenuPage = PageFactory.initElements(driver, PageObjects.Grafana.ServerAdminMenuPage.class);
		
		grafanaServerAdminMainPage = PageFactory.initElements(driver, PageObjects.Grafana.ServerAdminMainPage.class);
		
		grafanaUserListPage = PageFactory.initElements(driver, PageObjects.Grafana.UserListPage.class);
		
		/*-----------------Mobile---------------*/
		
		mortgageMain = PageFactory.initElements(driver, PageObjects.Mortgage.mainPage.class);
		
		/*-----------------Electron---------------*/
		
		ElectronMain = PageFactory.initElements(driver, PageObjects.ElectronDemo.MainPage.class);
		
		
		/*-----------------Desktop---------------*/
		
		calcMain = PageFactory.initElements(driver, PageObjects.calculator.MainPage.class);
		
	}
}
