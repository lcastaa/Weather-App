package xyz.aqlabs.ForecastApp.Models.Forecast;

public class PeriodsObject {

    private int number;
    private String name;
    private String startTime;
    private String endTime;
    private String isDaytime;
    private int temperature;
    private char temperatureUnit;
    private String windSpeed;
    private String  windDirection;
    private String shortForecast;
    private String detailedForecast;

    public PeriodsObject(int number, String name, String startTime, String endTime, String isDaytime, int temperature, char temperatureUnit, String windSpeed, String windDirection, String shortForecast, String detailedForecast) {
        this.number = number;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isDaytime = isDaytime;
        this.temperature = temperature;
        this.temperatureUnit = temperatureUnit;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.shortForecast = shortForecast;
        this.detailedForecast = detailedForecast;
    }

    public PeriodsObject() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getIsDaytime() {
        return isDaytime;
    }

    public void setIsDaytime(String isDaytime) {
        this.isDaytime = isDaytime;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public char getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(char temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getShortForecast() {
        return shortForecast;
    }

    public void setShortForecast(String shortForecast) {
        this.shortForecast = shortForecast;
    }

    public String getDetailedForecast() {
        return detailedForecast;
    }

    public void setDetailedForecast(String detailedForecast) {
        this.detailedForecast = detailedForecast;
    }

    @Override
    public String toString() {
        return "PeriodsObject{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", isDaytime='" + isDaytime + '\'' +
                ", temperature=" + temperature +
                ", temperatureUnit=" + temperatureUnit +
                ", windSpeed='" + windSpeed + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", shortForecast='" + shortForecast + '\'' +
                ", detailedForecast='" + detailedForecast + '\'' +
                '}';
    }

}
