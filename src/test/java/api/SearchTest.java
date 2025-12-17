package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {

    @BeforeClass
    public void setup() {
        baseURI = "https://dummyjson.com";
    }

    @Test
    public void phoneProductsSearchTest() {
        given().
                get("/products/search?q=phone&limit=5&skip=0").
                then().
                log().all().
                body("products[0].title" , equalTo("Apple AirPods Max Silver")).
                body("products[0].tags[0]" , equalTo("electronics")).
                body("total" , equalTo(23)).
                statusCode(200);
    }
    @Test
    public void laptopProductsSearchTest() {
        given().
                get("/products/search?q=laptop&limit=5&skip=0").
                then().
                log().all().
                body("products[0].category" , equalTo("laptops")).
                body("products[0].brand" , equalTo("Apple")).
                body("total" , equalTo(5)).
                statusCode(200);
    }
    @Test
    public void watchProductsSearchTest() {
        given().
                get("/products/search?q=watch&limit=5&skip=0").
                then().
                log().all().
                body("products[0].warrantyInformation" , equalTo("1 year warranty")).
                body("products[0].reviews[0].rating" , equalTo(1)).
                body("total" , equalTo(11)).
                statusCode(200);
    }
}