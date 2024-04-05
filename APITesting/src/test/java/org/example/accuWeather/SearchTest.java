package org.example.accuWeather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static io.restassured.RestAssured.given;

public class SearchTest {
    String apiKey = "7cq8BUg4Ge8m1oDEmev8kugwuSIvmAV4";
    String baseUrl = "http://dataservice.accuweather.com/";

    @ParameterizedTest
    @ValueSource(strings = {"Moscow", "Volgograd"})
    void searchRussiansCity(String s){
        List<AdministrativeArea> myList = given()
                .queryParam("q",s)
                .queryParam("apikey", apiKey)
                .when()
                .get(baseUrl+"locations/v1/cities/search")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", AdministrativeArea.class);

        AtomicBoolean flag = new AtomicBoolean(false);
        myList.forEach(u-> {
            if (u.getCountry().getEnglishName().equals("Russia")) flag.set(true);
        });
        Assertions.assertTrue(flag.get());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Prague", "Berlin", "Stockholm", "Riga", "Vilnius"})
    void searchEUCityRegions(String s){
        List<AdministrativeArea> myList = given()
                .queryParam("q",s)
                .queryParam("apikey", apiKey)
                .when()
                .get(baseUrl+"locations/v1/cities/search")
                .then()
                .statusCode(200)
                .extract()
                .body().jsonPath().getList(".", AdministrativeArea.class);

        AtomicBoolean flag = new AtomicBoolean(false);
        myList.forEach(u-> {
            if (u.getRegion().getEnglishName().equals("Europe")) flag.set(true);
        });
        Assertions.assertTrue(flag.get());

    }
}
