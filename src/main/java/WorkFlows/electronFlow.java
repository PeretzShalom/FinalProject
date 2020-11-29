package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class electronFlow extends CommonOps {
	@Step("Get Screen info (Resolution)")
	public static void getScreenInfo() {
		UIActions.click(ElectronMain.btn_windows);
		UIActions.click(ElectronMain.btn_Sys_info);
		UIActions.click(ElectronMain.btn_demo_toggle);
		UIActions.click(ElectronMain.btn_demo_toggle);
		UIActions.click(ElectronMain.btn_screen_info);
	}
}
