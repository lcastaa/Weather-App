package xyz.aqlabs.ForecastApp.Models.Weather;

public class WeatherData {

    private PropertiesObject properties;

    public WeatherData(PropertiesObject properties) {
        this.properties = properties;
    }

    public WeatherData() {
    }

    public PropertiesObject getProperties() {
        return properties;
    }

    public void setProperties(PropertiesObject properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "properties=" + properties +
                '}';
    }

}
