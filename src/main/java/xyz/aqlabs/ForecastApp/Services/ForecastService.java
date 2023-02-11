package xyz.aqlabs.ForecastApp.Services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import xyz.aqlabs.ForecastApp.Models.Forecast.ForecastData;
import xyz.aqlabs.ForecastApp.Models.Forecast.PeriodsObject;
import xyz.aqlabs.ForecastApp.Models.GeoCoding.GeoData;
import xyz.aqlabs.ForecastApp.Models.Weather.WeatherData;

import java.util.List;
import java.util.Objects;

import static xyz.aqlabs.ForecastApp.Services.WeatherService.restTemplate;

public class ForecastService {

    public PeriodsObject getForecast(String forecastUrl) {
        PeriodsObject obj = null;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        obj = restTemplate.getForObject(forecastUrl, ForecastData.class).getProperties().getPeriods().get(0);
        return obj;
    }

    public List<PeriodsObject> getListOfForecasts(String forecastUrl){
        List<PeriodsObject> periodsObjectList = null;
        periodsObjectList = restTemplate.getForObject(forecastUrl, ForecastData.class).getProperties().getPeriods();
        return periodsObjectList;
    }


}
