package xyz.aqlabs.ForecastApp.Models.GeoCoding;

public class Data {

    private double latitude;
    private double longitude;


    public Data(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public Data() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }



    @Override
    public String toString() {
        return "Data{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +

                '}';
    }
}
