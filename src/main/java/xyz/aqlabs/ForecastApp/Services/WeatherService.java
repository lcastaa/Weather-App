package xyz.aqlabs.ForecastApp.Services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import xyz.aqlabs.ForecastApp.Models.GeoCoding.GeoData;
import xyz.aqlabs.ForecastApp.Models.Weather.WeatherData;

import java.util.Objects;


public class WeatherService {
    
    public static final RestTemplate restTemplate = new RestTemplate();
    

    public String getCoordinates(String address){
        String API_URL = "http://api.positionstack.com/v1/forward?access_key=21ae72c60030b5f37a899f09b579aae6";
        ResponseEntity<GeoData> response = restTemplate.getForEntity(API_URL+"&query="+address+"&country=us", GeoData.class);
        return getWeatherDetails(Objects.requireNonNull(response.getBody()).toString().replace("GeoData{data=[Data{latitude=","").replace(" ","").replace("longitude=","").replace("}]}",""));
    }

    private String getWeatherDetails(String cords){
        String API_URL = "https://api.weather.gov/points/";
        return restTemplate.getForObject(API_URL+cords, WeatherData.class).getProperties().getForecast();
    }
    
    
}
