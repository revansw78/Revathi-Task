package taskwork_ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojo.OpenLibrary;


import static com.codeborne.selenide.Selenide.open;

public class OpenLibraryStepDef {
    protected Response getResponse;
    protected OpenLibrary author;

    @Given("Invoked the Get Authors from {string} and {string}")
    public void GetAuthors(String url1, String authorid) {
        open();

        RestAssured.baseURI = url1;
        RestAssured.useRelaxedHTTPSValidation();
        RequestSpecification request =
                RestAssured.given()
                        .log()
                        .all()
                        .header("Content-Type", "application/json")
                        .header("User-Agent", "PostmanRuntime/7.32.3")
                        .header("Accept", "*/*")
                        .header("Accept-Encoding", "gzip, deflate, br")
                        .header("Connection", "keep-alive");

        getResponse = request.get(authorid);
        System.out.println(getResponse.asString());
    }

    @When("deserialise the response array to a OpenLibrary")
    public void deserialiseTheResponse() {
        author = getResponse.getBody().as(new TypeRef<>() {
        });
        System.out.println("Open Library author name: " + author.getName());

    }

    @Then("validate the OpenLibrary content")
    public void validateThePostapiContent() {


        // Status check

        Assert.assertEquals("Validating Response Code", 200, getResponse.getStatusCode());

        //Content check
        Assert.assertEquals("Validating personal_name", "Sachi Rautroy", author.getPersonal_name());
        System.out.println("personal name assertion pass");
        var AlternatenamesList = author.getAlternate_names();
        //for (int i = 0; i < author.getAlternate_names().size(); i++) {
        // System.out.println(
        // "Alternate name Details:"
        //  + AlternatenamesList.get(i));
        // }
        Assert.assertEquals("Yugashrashta Sachi Routray", AlternatenamesList.get(7));
        System.out.println("Alternate names assertion pass ");


    }
}


