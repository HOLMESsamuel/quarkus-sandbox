package controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;


@QuarkusTest
class CatControllerTest {

	@Test
	public void testAppStartupAndBasicEndpoint() {
		given()
				.when().get("/ping")
				.then()
				.statusCode(200)
				.body(is("pong"));
	}

}