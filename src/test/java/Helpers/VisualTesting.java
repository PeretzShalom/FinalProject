package Helpers;

import Utilities.CommonOps;
import Utilities.HelperMethods;
import WorkFlows.webFlows;
import org.testng.annotations.Test;

public class VisualTesting extends CommonOps {
	@Test
	public void createScreenShot() {
		webFlows.login("admin", "admin");
		HelperMethods.TakeElementScreenShot(grafanaLeftMenu.img_Avatar, "gafanaAvatar_ver 1.0");
	}
	
	
}
