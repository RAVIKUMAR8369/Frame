package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostReq {

	@Test
	public void Post() {
		JSONObject jsondata=new JSONObject();
		jsondata.put("Name","Ravi");
		jsondata.put("Job","QA");
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-Type","application/json")
		.header("x-api-key","reqres-free-v1")
		.body(jsondata.toJSONString())
		.contentType(ContentType.JSON).
		when().post().then().statusCode(201).log().all();
		
		
	}
}
