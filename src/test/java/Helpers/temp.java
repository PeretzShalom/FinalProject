package Helpers;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class temp {
	
	String url = "http://localhost:3000/";
	RequestSpecification HttpRequest;
	Response response;
	
	@Test
	public void teasingApi() {
		JSONObject params = new JSONObject();
		params.put("name", "Ateam");
		params.put("eamil", "Ateam@gmail.com");
		
		RestAssured.baseURI = url;
		HttpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");


                             /* <!----- get Method -----!>

         response = HttpRequest.get("api/teams/search?perpage=50&page=1");
         System.out.println(response.prettyPrint());
         */

                            /* <!----- Put Method -----!>


              /* <!----- Insert parameters into Post Method -----!>

        JSONObject params = new JSONObject();
        params.put("name","Ateam");
        params.put("eamil","Ateam@gmail.com");


        HttpRequest.header("Content-Type","application/json");
        HttpRequest.body(params.toJSONString());
        response=HttpRequest.put("api/teams/2");
        System.out.println(response.prettyPrint());
         */

                            /*<!----- Post Method -----!>

          <!----- Insert parameters into Post Method -----!>

        JSONObject params = new JSONObject();
        params.put("name","Ateam");
        params.put("eamil","Ateam@grafana.com");
        HttpRequest.header("Content-Type","application/json");
        HttpRequest.body(params.toJSONString());
        response=HttpRequest.post("api/teams");
        System.out.println(response.prettyPrint());
        */

                             /* <!----- Delete Method -----!>

                              <!----- Select the parameters to delete Method -----!>*/
		
		HttpRequest.header("Content-Type", "application/json");
		HttpRequest.body(params.toJSONString());
		response = HttpRequest.delete("api/teams/2");
		System.out.println(response.prettyPrint());
	}
}
