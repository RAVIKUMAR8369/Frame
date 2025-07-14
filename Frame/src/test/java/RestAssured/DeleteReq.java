package RestAssured;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class DeleteReq {

	@Test
	public void delete() {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		RestAssured.given().header("x-api-key","reqres-free-v1")
		.when().delete().then().statusCode(204).log().all();
	}
}
