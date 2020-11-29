package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Utilities.Listeners.class)
public class mortgageMobile extends CommonOps {
	@Test(description = "Test01: Verify Mortgage  ")
	@Description("Test Description: Fill in Mortgage fields and calculate repayment")
	public void test01_VerifyRepayment() {
		mobileFlows.calculator("1000", "3", "4");
		Verifications.TextInElement(mortgageMain.txt_repayment, "£30.03");
	}
	
	
	@Test(description = "Test02: Verify Mortgage data saved")
	@Description("Test Description: Fill in Mortgage fields and click on save")
	public void test02_VerifySaving() {
		mobileFlows.saveData();
		Verifications.TextInElement(mortgageMain.txt_message, "Saved!");
		
	}
	
}
