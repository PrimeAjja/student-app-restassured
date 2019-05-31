package com.studentapp.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani on 31-May-2019
 */
public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
    }
}
