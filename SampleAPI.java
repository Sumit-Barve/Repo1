package com.apitests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given; public class SampleAPITest {
// A simple, reliable API test using REST-Assured @Test
public void verifyGitHubStatusIs200() { given()
.when()
.get("https://api.github.com/users/octocat")
.then()
.statusCode(200); // Asserts the response code is 200 (Success)
}

// A second test to verify a 404 Not Found status @Test
public void verifyInvalidEndpointStatusIs404() { given()
.when()
.get("https://api.github.com/nonexistent")
.then()
.statusCode(404); // Asserts the response code is 404 (Not Found)
}
