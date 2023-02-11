package xyz.aqlabs.ForecastApp.Models.Forecast;

public class ForecastData {

    private PropertiesObject properties;

    public ForecastData(PropertiesObject properties) {
        this.properties = properties;
    }

    public ForecastData() {
    }

    public PropertiesObject getProperties() {
        return properties;
    }

    public void setProperties(PropertiesObject properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ForecastData{" +
                "properties=" + properties +
                '}';
    }



}
