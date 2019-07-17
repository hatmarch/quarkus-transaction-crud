package com.transactionapp;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TransactionResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/transaction")
          .then()
             .statusCode(200);
             
    }

}