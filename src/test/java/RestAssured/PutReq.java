package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutReq {
	
	@Test
	public void Put() {
		JSONObject jsondata=new JSONObject();
		jsondata.put("Name","Ravi");
		jsondata.put("Job","Eng");
		RestAssured.baseURI="https://reqres.in/api/users/402";
		RestAssured.given().header("Content-Type","application/json").header("x-api-key","reqres-free-v1").body(jsondata.toJSONString())
		.contentType(ContentType.JSON).when().put().then().statusCode(200).log().all();
	
	}

}
