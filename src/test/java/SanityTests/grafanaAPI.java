package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaAPI extends CommonOps {
	/* @Test(description = "Test01: Get team from Grafana")
	   @Description("Test description: Login to Grafana and Get Team")
	   public void test01_GetTeam()
	   {
		   Verifications.text(apiFlows.getTeamProperty("teams[0].name"),"ShalomTeam");
	   }
	*/
	@Test(description = "Test01: Add team and Verify it")
	@Description("Test description: Add team to Grafana and Verify it")
	public void test01_AddTeamAndVerify() {
		apiFlows.postTeam("ShalomTeam1", "Shalom@Team2.com");
		Verifications.text(apiFlows.getTeamProperty("teams[0].name"), "ShalomTeam1");
	}
	
	@Test(description = "Test02: Update team and Verify it")
	@Description("Test description: Update team in Grafana and Verify it")
	public void test02_UpdateTeamAndVerify() {
		apiFlows.UpdateTeam("MyTeam", "Shalom@Team2.com", "8");
		Verifications.text(apiFlows.getTeamProperty("teams[0].name"), "MyTeam");
	}
	
	@Test(description = "Test03: Delete team and Verify it")
	@Description("Test description: Delete team in Grafana and Verify it")
	public void test03_DeleteTeamAndVerify() {
		apiFlows.DeleteTeam("8");
		Verifications.text(apiFlows.getTeamProperty("totalCount"), "0");
	}
}
