package org.example.accuWeather;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbstractWeatherTest {
    static Properties properties = new Properties();
    private static InputStream configFile;
    private static String apikey;
    private static String baseUrl;

    @BeforeAll
    @Test
    static void initTests() throws IOException {
        configFile = new FileInputStream("src/test/java/resources.properties");
        properties.load(configFile);
        apikey = properties.getProperty("apikey");
        baseUrl = properties.getProperty("base_url");
    }

    public static String getApiKey() {
        return apikey;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }
}
