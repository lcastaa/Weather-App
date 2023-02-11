package xyz.aqlabs.ForecastApp.Models.GeoCoding;

import java.util.ArrayList;
import java.util.List;

public class GeoData {

    private List<Data> data = new ArrayList<>();

    public GeoData() {
    }

    public GeoData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GeoData{" +
                "data=" + data +
                '}';
    }
}