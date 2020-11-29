package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.electronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class electronDemo extends CommonOps {
	@Test(description = "Test01: Verify Screen Resolution")
	@Description("Test description: Getting the Resolution from the app and verify it")
	public void test01_VerifyText() {
		electronFlow.getScreenInfo();
		Verifications.TextInElement(ElectronMain.field_screen_info, "Your screen is: 1280px x 720px");
		
		
	}
}
