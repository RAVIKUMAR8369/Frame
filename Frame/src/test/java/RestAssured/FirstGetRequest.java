package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class FirstGetRequest {

	@Test
	public void GetReq() {
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Response body"+res.asString());
		System.out.println("Status code"+res.statusCode());
		System.out.println("Body"+res.getBody());
		
		int actualcode=res.getStatusCode();
		Assert.assertEquals(actualcode,200);
	}
	
	
	@Test
	
	public void Test1() {
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().queryParam("Page","2")
		.when().get().then().statusCode(200);
				
	}
	
	

	
	
	
	
	
	
	
	
}
