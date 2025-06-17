package com.api.testing.tests;


import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @Test
    @DisplayName("GET /users/2 -> Should return valid user data")
    public void getSingleUser_shouldReturnValidUser() {
        given()
            .header("x-api-key", "reqres-free-v1")
            .log().all()
        .when()
            .get("/api/users/2")
        .then()
            .statusCode(200)
            .body("data.id", equalTo(2))
            .body("data.email", containsString("@reqres.in"))
            .body("data.first_name", notNullValue())
            .body("data.last_name", notNullValue())
            .body("data.avatar", startsWith("https://"));
    }

    @Test
    @DisplayName("GET /users/23 -> Should return 404 for non-existing user")
    public void getNonExistingUser_shouldReturn404() {
        given()
            .header("x-api-key", "reqres-free-v1")
            .log().all()
        .when()
             .get("/api/users/23")
        .then()
            .statusCode(404);
    }
}