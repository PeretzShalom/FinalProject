package WorkFlows;

import Extensions.UIActions;
import Extensions.dbActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.util.List;

public class webFlows extends CommonOps {
	@Step("Login to GrafanaWeb")
	public static void login(String user, String pass) {
		UIActions.UpdateText(grafanaLogin.txt_userName, user);
		UIActions.UpdateText(grafanaLogin.txt_password, pass);
		UIActions.click(grafanaLogin.btn_login);
		UIActions.click(grafanaLogin.btn_skip);
	}
	
	@Step("Login to Grafana Flow with DB Credentials")
	public static void loginDB() {
		List<String> cred = dbActions.getCredentials("SELECT user_name, password FROM Credentials WHERE id='3'");
		UIActions.UpdateText(grafanaLogin.txt_userName, cred.get(0));
		UIActions.UpdateText(grafanaLogin.txt_password, cred.get(1));
		UIActions.click(grafanaLogin.btn_login);
		UIActions.click(grafanaLogin.btn_skip);
	}
	
	@Step("Create a new user account")
	public static void createUser(String name, String email, String pass, String user) {
		UIActions.click(grafanaServerAdminMainPage.Btn_NewUser);
		UIActions.UpdateText(grafanaUserListPage.Text_name, name);
		UIActions.UpdateText(grafanaUserListPage.Text_Email, email);
		UIActions.UpdateText(grafanaUserListPage.Text_UserName, user);
		UIActions.UpdateText(grafanaUserListPage.Text_Pass, pass);
		UIActions.click(grafanaUserListPage.Btn_CreateUser);
	}
	
	@Step("delete last user from users table")
	public static void deleteLastUser() {
		
		/// Take the last added row user
		UIActions.click(grafanaServerAdminMainPage.rows.get(0));
		UIActions.click(grafanaUserListPage.Btn_Delete);
		UIActions.click(grafanaUserListPage.Btn_ConfirmDelete);
		
	}
	
	
}
