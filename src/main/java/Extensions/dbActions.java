package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class dbActions extends CommonOps {
	@Step("Get Credentials from DB table")
	public static List<String> getCredentials(String query) {
		List<String> credentials = new ArrayList<String>();
		try {
		    rs = stmt.executeQuery(query);
            rs.next();
            credentials.add(rs.getString(1));
            credentials.add(rs.getString(2));
        } catch (SQLException e) {
            System.out.println("Error occurred while printing table data,See details:" + e);
        }
        return credentials;
	}
}
