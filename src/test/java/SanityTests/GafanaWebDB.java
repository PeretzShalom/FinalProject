package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.webFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)

public class GafanaWebDB extends CommonOps {
	@Test(description = "Test01: Login to Garfana with DB")
	@Description("Test description:  Login to Garfana web Application with DB  ")
	public void test01_loginDB() {
		webFlows.loginDB();
		Verifications.TextInElement(grafanaMain.txt_mainHeading, "Welcome to Grafana");
	}
}
