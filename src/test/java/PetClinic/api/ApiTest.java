package PetClinic.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
public class ApiTest {

    private OwnerRestControllerObject ownerRestControllerObject;

    @BeforeClass
    public void setUp() {

        RestAssured.baseURI = "http://139.59.149.247";
        RestAssured.port = 9966;
        RestAssured.basePath = "/petclinic/api";
    }

    @BeforeMethod
    public void createOwner(){

        ownerRestControllerObject = postOwnerTest();

    }

    @AfterMethod
    public void deleteOwner(){
        deleteOwnerByIdTest(String id);

    }

    @Test
    public void getOwnerByIdTest(){
    RestAssured.given()
            .get("owners/{ownerId}",ownerRestControllerObject.getId())
            .then()
            .statusCode(200)
            .log().all();



    }

    @Test
    private OwnerRestControllerObject postOwnerTest(){

    OwnerRestControllerObject owner25= new OwnerRestControllerObject();
    owner25.setFirstName("Oleg");
    return RestAssured.given()
            .contentType(ContentType.JSON)
            .body(owner25)
            .post("/owners")
            .then()
            .statusCode(201)
            .extract().body()
            .as(OwnerRestControllerObject.class);




    }

    @Test
    public void deleteOwnerByIdTest(String id){

    RestAssured.given()
            .log().all()
            .delete("/owners{id}",id)
            .then()
            .statusCode(200);

    }




}
*/