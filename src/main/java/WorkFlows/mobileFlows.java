package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class mobileFlows extends CommonOps {
	@Step("Fill in form and Calc Mortgage")
	public static void calculator(String amount, String term, String rate) {
		UIActions.UpdateText(mortgageMain.txt_amount, amount);
		UIActions.UpdateText(mortgageMain.txt_term, term);
		UIActions.UpdateText(mortgageMain.txt_rate, rate);
		UIActions.click(mortgageMain.btn_calculate);
		
	}
	
	@Step("Saved the data of the Mortgage")
	public static void saveData() {
		UIActions.click(mortgageMain.btn_saved);
	}
}
