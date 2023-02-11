package xyz.aqlabs.ForecastApp.Models.Forecast;

import java.util.List;

public class PropertiesObject {


    private List<PeriodsObject> periods;

    public PropertiesObject() {
    }

    public PropertiesObject(List<PeriodsObject> periods) {
        this.periods = periods;
    }

    public List<PeriodsObject> getPeriods() {
        return periods;
    }

    public void setPeriods(List<PeriodsObject> periods) {
        this.periods = periods;
    }

    @Override
    public String toString() {
        return "PropertiesObject{" +
                "periods=" + periods +
                '}';
    }

}
