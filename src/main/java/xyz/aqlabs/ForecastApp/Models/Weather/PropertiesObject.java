package xyz.aqlabs.ForecastApp.Models.Weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertiesObject {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("@type")
    private String type;
    private String cwa;
    private String forecastOffice;
    private String gridId;
    private float gridX;
    private float gridY;
    private String forecast;
    private String forecastHourly;
    private String forecastGridData;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCwa() {
        return cwa;
    }

    public void setCwa(String cwa) {
        this.cwa = cwa;
    }

    public String getForecastOffice() {
        return forecastOffice;
    }

    public void setForecastOffice(String forecastOffice) {
        this.forecastOffice = forecastOffice;
    }

    public String getGridId() {
        return gridId;
    }

    public void setGridId(String gridId) {
        this.gridId = gridId;
    }

    public float getGridX() {
        return gridX;
    }

    public void setGridX(float gridX) {
        this.gridX = gridX;
    }

    public float getGridY() {
        return gridY;
    }

    public void setGridY(float gridY) {
        this.gridY = gridY;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getForecastHourly() {
        return forecastHourly;
    }

    public void setForecastHourly(String forecastHourly) {
        this.forecastHourly = forecastHourly;
    }

    public String getForecastGridData() {
        return forecastGridData;
    }

    public void setForecastGridData(String forecastGridData) {
        this.forecastGridData = forecastGridData;
    }

}
