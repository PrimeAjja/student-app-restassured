package com.studentapp.studentinfo;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Jay Vaghani on 31-May-2019
 */
public class StudentCURDTest {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
    }

    @Test
    public void getAllStudent() {
    }
}
