package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.calcFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.Listeners.class)
public class CalcDesktop extends CommonOps {
	@Test(description = "Test01: See test result")
	@Description("Test description: Calculate numbers and verify the result")
	public void test01_Addition() {
		calcFlow.CalculateAddition();
		Verifications.TextInElement(calcMain.field_result, "4");
	}
}
