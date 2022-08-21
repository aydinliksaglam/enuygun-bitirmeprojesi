package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;
import javax.xml.ws.Response;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GetMethods {
    public static void GetMethodStokFiyat(String ch){
        given().contentType(ContentType.JSON).
                when()
                .get(String.format("https://630248969eb72a839d6ce9c3.mockapi.io/api/",ch)).

                then()
                .body("name",is("grapes")).statusCode(200);
    }
    public static void IsimQueryParam(){
        given()
                .contentType(ContentType.JSON)
                .queryParam("name","apple");
        when()
                .get("").
                then()
                .statusCode(200);
    }
    public static void YeniUrun(){
        List<String> names = RestAssured.when().get(String.format("https://630248969eb72a839d6ce9c3.mockapi.io/api/:endpoint"))
                .then().extract().jsonPath()
                .getList("results.name");
        Assert.assertTrue(names.contains("Get Schwifty"));
        System.out.println(names.size());
        System.out.println(names);
        List<String> episodes = RestAssured.when().get(String.format("https://630248969eb72a839d6ce9c3.mockapi.io/api/:endpoint"))
                .then().extract().jsonPath()
                .getList("results.episode");
        Assert.assertTrue(episodes.contains("S02E05"));
        System.out.println(episodes.size());
        System.out.println(episodes);
    }
}
