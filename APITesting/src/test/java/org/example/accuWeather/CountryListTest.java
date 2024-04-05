package org.example.accuWeather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class CountryListTest {

    String apiKey = "7cq8BUg4Ge8m1oDEmev8kugwuSIvmAV4";
    String baseUrl = "http://dataservice.accuweather.com/";

    @Test
    void countryListStatusCheck (){
        given()
                .queryParam("apikey", apiKey)
                .when()
                .get(baseUrl+"locations/v1/countries/EUR")
                .then()
                .statusCode(200);
    }

    @Test
    @Disabled
    void countryListContains(){
        List<AdministrativeArea> countries =
                given()
                        .when()
                        .get(baseUrl+"locations/v1/countries/EUR")
                        .then()
                        .extract()
                        .body().jsonPath().getList(".", AdministrativeArea.class);

        Assertions.assertTrue(countries.size()>0);
        Assertions.assertNotNull(countries);

    }

}
