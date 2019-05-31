package com.studentapp.examples;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AssertionsExamples {
	static final String APIKEY = "75e3u4sgb2khg673cbv2gjup";

	@BeforeClass
	public static void init() {

		RestAssured.baseURI = "http://api.walmartlabs.com";
		RestAssured.basePath = "/v1";
	}

	// 1) Verify if the number of items is equal to 10
	@Test
	public void test001() {
		given()
				.queryParam("query","ipod")
				.queryParam("apiKey",APIKEY)
				.queryParam("format","json")
				.when()
				.get("/search")
				.then()
				.body("numItems", equalTo(10));
		
	}

	// 2) Verify Query
	@Test
	public void test002() {

	}


	// 3) Check Single Name in ArrayList (Refurbished Apple iPod nano 16GB, Blue)
	@Test
	public void test003() {

	}

	// 4) Check Multiple Names in ArrayList (Refurbished Apple iPod nano 16GB, Blue","Apple iPod Touch 6th Generation 16GB Refurbished)
	@Test
	public void test004() {

	}
	
	// 5) Verify the gift options for the first product (Checking Values inside Map using hasKey(allowGiftWrap))
		@Test
		public void test005() {

			}

	// 6) Check hash map values inside a list
	@Test
	public void test006() {

				/*given()
				.queryParam("query","ipod")
				.queryParam("apiKey",APIKEY)
				.queryParam("format","json")
				.when()
				.get("/search")
				.then()
				.body("items.findAll{it.name=='Apple iPod touch 32GB'}", hasItems(hasEntry("name", "Apple iPod touch 32GB")));*/
				
	}
	

	// 7) Checking multiple values in the same statement
	@Test
	public void test007() {
		/*given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format","json")
		.when()
		.get("/search")
		.then()
		.body("items[0].giftOptions", hasKey("allowGiftWrap"))
		.body("items.findAll{it.name=='Apple iPod touch 32GB'}", hasItems(hasEntry("name", "Apple iPod touch 32GB")))
		.body("items.name",hasItem("Refurbished Apple iPod nano 16GB, Blue"))
		.statusCode(200);*/
	}

	// 8) Logical Assertions
	@Test
	public void test008() {
		/*given()
		.queryParam("query","ipod")
		.queryParam("apiKey",APIKEY)
		.queryParam("format","json")
		.when()
		.get("/search")
		.then()
		.body("items.size()",equalTo(10))
		.body("items.size()",greaterThan(5))
		.body("items.size()",lessThan(11))
		.body("items.size()",greaterThanOrEqualTo(10))
		.body("items.size()",lessThanOrEqualTo(10));*/
			
	}

}
