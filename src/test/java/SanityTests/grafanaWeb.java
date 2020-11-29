package SanityTests;

import Extensions.UIActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.Listeners.class)
public class grafanaWeb extends CommonOps {
	@Test(description = "Test01: Login to Grafana")
	@Description("Test description: Login to garafana web application")
	public void test01_login() {
		webFlows.login(getData("user"), getData("password"));
		Verifications.TextInElement(grafanaMain.txt_mainHeading, "Welcome to Grafana");
	}
	
	@Test(description = "Test02: Verify Default Users at the Grafana application ")
	@Description("Test description: Verifies the default number of the user equals to 1 ")
	public void test02_VerifyDefaultUsers() {
		/// preforming mouse hover action ///
		UIActions.MouseHoverElements(grafanaLeftMenu.btn_ServerAdmin, grafanaServerAdminMenuPage.link_users);
		Verifications.NumberOfElements(grafanaServerAdminMainPage.rows, 1);
		
	}
	
	@Test(description = "Test03: Add a new user and Verify")
	@Description("Test description: Verifies the new added user at the table")
	public void test03_AddAndVerifiedUser() {
		
		UIActions.MouseHoverElements(grafanaLeftMenu.btn_ServerAdmin, grafanaServerAdminMenuPage.link_users);
		
		/// preforming Add new user form action ///
		
		webFlows.createUser("Shalom", "shalom@gmail.com", "Oscar702", "ShalomP");
		
		wait.until(ExpectedConditions.visibilityOf(grafanaServerAdminMainPage.Btn_NewUser));
		
		Verifications.NumberOfElements(grafanaServerAdminMainPage.rows, 2);
		
	}
	
	@Test(description = "Test04: Delete last User and verify the Default user (should be 1) ")
	@Description("Test Description: Verifies the default number of the user equals to 1 (Admin)")
	public void test04_DeleteAndVerifiedUser() {
		/// preforming Add new user form action ///
		
		UIActions.MouseHoverElements(grafanaLeftMenu.btn_ServerAdmin, grafanaServerAdminMenuPage.link_users);
		
		webFlows.deleteLastUser();
		
		Verifications.NumberOfElements(grafanaServerAdminMainPage.rows, 1);
	}
	
	@Test(description = " Test05: Verify Avatar ")
	@Description("Test Description: Verifies the Avatar image")
	public void test05_VerifyAvatar() {
		Verifications.visualElement(grafanaLeftMenu.img_Avatar, "gafanaAvatar_ver 1.0");
	}
}
