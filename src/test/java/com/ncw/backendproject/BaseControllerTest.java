package com.ncw.backendproject;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = {BackendProjectApplication.class})
@ActiveProfiles("test")
public class BaseControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    @BeforeEach
    protected void baseSetUp() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
    }
    protected MockMvcRequestSpecification given() {
        return RestAssuredMockMvc.given();
    }
}
