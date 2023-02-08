package com.Ascom.step_definitions;

import com.Ascom.pojo.Products;
import com.Ascom.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class POST_Api {

    Response response;

    @Given("user has the right authorization")
    public void userHasTheRightAuthorization() {

        RestAssured.baseURI = ConfigurationReader.getProperty("getProductsEndPoint");


    }

    @When("I send a POST request to the endpoint with the details of a New NF Fleece")
    public void iSendAPOSTRequestToTheEndpointWithTheDetailsOfANewNFFleece() {

        Products products = new Products(2090,"Blue Origin","Toddler AstronautFlight Suit",49.95,1,"suit");

        response = given().body(products).when().post("/create.php").prettyPeek();

    }

    @Then("the North face fleece should be added to the inventory")
    public void theNorthFaceFleeceShouldBeAddedToTheInventory() {


    }

    @And("I should get status code {int}")
    public void iShouldGetStatusCode(int arg0) {


    }

}
