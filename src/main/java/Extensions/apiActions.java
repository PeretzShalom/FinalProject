package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class apiActions extends CommonOps {
    @Step("Get data from server")
    public static Response get(String pramValues) {
        response = HttpRequest.get(pramValues);
        System.out.println(response.prettyPrint());
        return response;
    }
    
    @Step("Post data to server")
    public static void post(JSONObject params, String resource) {
        HttpRequest.header("Content-Type", "application/json");
        HttpRequest.body(params.toJSONString());
        response = HttpRequest.post(resource);
        System.out.println(response.prettyPrint());
    }
    
    @Step("Update data in server")
    public static void put(JSONObject params, String resource) {
        HttpRequest.header("Content-Type", "application/json");
        HttpRequest.body(params.toJSONString());
        response = HttpRequest.put(resource);
        System.out.println(response.prettyPrint());
    }
    
    @Step("delete data from server")
    public static void delete(String id) {
        response = HttpRequest.delete("/api/teams/" + id);
        System.out.println(response.prettyPrint());
    }
    
    @Step("Extract value from JSON Format")
    public static String extractFromJSON(Response response, String path) {
        jp = response.jsonPath();
        return jp.get(path).toString();
    }
}
