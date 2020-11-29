package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class calcFlow extends CommonOps {
	@Step("Calculator Addition")
	public static void CalculateAddition() {
		UIActions.click(calcMain.btn_Clear);
		UIActions.click(calcMain.btn_One);
		UIActions.click(calcMain.btn_Plus);
		UIActions.click(calcMain.btn_Seven);
		UIActions.click(calcMain.ban_Equals);
		
	}
}
