package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;


public class GetIsimSteps {
    @Given("I perform Get Operations")
    public void iPerformGetOperationsFor(String url) throws Throwable {
    }
    @And("^I perform Get for the Isim number")
    public void iPerformGetForTheIsimNumber(String ch) throws Throwable {
        GetMethods.GetMethodIsim(ch);
    }

    @Then("^I should see verify GET parameter$")
    public void iShouldSeeVerifyGETParameter() {
        GetMethods.IsimQueryParam();
    }
}
