package PetClinic.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.hasItems;

public class PetTypesTest {

    @BeforeClass
    public void setUp(){
    RestAssured.baseURI ="http://139.59.149.247:9966";
    RestAssured.port= 9966;
    RestAssured.basePath ="/petclinic/api";
    RestAssured.defaultParser = Parser.JSON;


    }

 //   @Test
    public void getPetTypeTest(){
        RestAssured.given()
                .accept(ContentType.JSON)
                .baseUri("http://139.59.149.247:9966/petclinic/api")
                .get("pettypes")
                .then()
                .statusCode(200)
                .body("id", hasItems(48,92))
                .body ("name", hasItems("cat", "dragon"))
                .log().all();



    }
  //  @Test
    public void getPetTypeByIdTest(){
        RestAssured.given()
                .accept(ContentType.JSON)
                .baseUri("http://139.59.149.247:9966/petclinic/api")
                .get("/pettypes/"+92)
                .then()
                .statusCode(200)
                .body("id", equalTo(92))
                .body ("name", equalTo("cat"))
                .log().all();
    }



//    @Test
//    public void postPetTypeTest(){
//        String petType =
//        RestAssured.given()
//                  .accept(ContentType.JSON)
//                .accept(ContentType.JSON)
//                    .baseUri("http://139.59.149.247:9966/petclinic/api")
//                    .body("{\n" +
//                            "  \"id\": 94,\n" +
//                            "  \"name\": \"dragon\"\n" +
//                            "}";
//
//
// )
//                    .post("/pettypes/")
//                .then()
//                .statusCode(201)
//                .body("id", notNullValue())
//                .body ("name", equalTo("cat"))
//                .log().all();
//    }
}
