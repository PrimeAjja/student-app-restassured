package com.studentapp.studentinfo;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay Vaghani on 31-May-2019
 */
public class StudentGetTest {

    @Test
    public void getAllStudentInformation(){
        /**
         * given()
         * set cookies,add auth,adding parameters,setting header info
         * .when()
         * GET,POST,PUT,DELETE..etc
         * .then()
         *  Validate status code,extract response, extract headers,cookies,extract the response body
         *
         */

        Response response=	given()
                .when()
                .get("/list");

        System.out.println(response.body().prettyPrint());

        //Validate the status code

        given()
                .when()
                .get("/list")
                .then()
                .statusCode(200);

    }

    @Test
    public void getStudentInfo(){
        Response response=given()
                .when()
                .get("/1");

        //	System.out.println(response.body().prettyPrint());

        given()
                .when()
                .get("/1")
                .then()
                .statusCode(200);
    }

    @Test
    public void getStudentsFromFA(){
        Response response=	given()
                .when()
                .get("/list?programme=Financial Analysis&limit=2");

        System.out.println(response.prettyPeek());

        Response response2= given()
                .param("programme", "Financial Analysis")
                .param("limit",2)
                .when()
                .get("/list");

        System.out.println(response2.prettyPeek());}
}
