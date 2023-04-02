package com.ncw.backendproject.controller;

import com.ncw.backendproject.BackendProjectApplication;
import com.ncw.backendproject.BaseControllerTest;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


class HelloWorldControllerTest extends BaseControllerTest {
    @Test
    void should_return_nihao() {
        var response = given()
                .get("/hello")
                .then()
                .status(HttpStatus.OK)
                .extract()
                .asString();

        assertEquals("Ni Hao!", response);
    }
}