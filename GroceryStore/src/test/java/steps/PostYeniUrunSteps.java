package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class PostYeniUrunSteps {
    @Given("^I perform Get operations for urun$")
    public void Ä±PerformGetOperationsForUrun() {
        given().contentType(ContentType.JSON);
    }
    @Then("^I should see verify name as $")
    public void Ä±ShouldSeeVerifyNameAs(String arg0) throws Throwable {
        GetMethods.YeniUrun();
    }
}
