package Utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {
	public static String platform;
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public static Screenshot imageScreenShot;
	public static ImageDiffer imgDiff = new ImageDiffer();
	public static ImageDiff diff;
	public static DesiredCapabilities dc = new DesiredCapabilities();
	
	/*-------------Grafana-------*/
	
	public static PageObjects.Grafana.LoginPage grafanaLogin;
	public static PageObjects.Grafana.mainPage grafanaMain;
	public static PageObjects.Grafana.LeftMenuPage grafanaLeftMenu;
	public static PageObjects.Grafana.ServerAdminMenuPage grafanaServerAdminMenuPage;
	public static PageObjects.Grafana.ServerAdminMainPage grafanaServerAdminMainPage;
	public static PageObjects.Grafana.UserListPage grafanaUserListPage;
	
	
	/*-------------Mobile --> Appium-------*/
	
	public static PageObjects.Mortgage.mainPage mortgageMain;
	public static RequestSpecification HttpRequest;
	public static Response response;
	public static JSONObject requestParams = new JSONObject();
	public static JsonPath jp;
	
	/*-------------Mobile --> Electron-------*/
	
	public static PageObjects.ElectronDemo.MainPage ElectronMain;
	
	/*-------------Desktop --> Calculator -------*/
	
	public static PageObjects.calculator.MainPage calcMain;
	
	/*-------------Desktop --> DB -------*/
	
	public static Connection con;
	public static Statement stmt;
	public static ResultSet rs;
	
}

