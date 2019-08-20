package com.its4u.immo.publication.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class HelloWorldEndpointTest {

    @Test
    public void testHello() {
        get("/hello")
                .then()
                .statusCode(200)
                .body("message", equalTo("Hello from Quarkus!"));
    }

}