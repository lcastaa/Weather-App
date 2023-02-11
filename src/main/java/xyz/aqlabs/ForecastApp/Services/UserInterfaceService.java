package xyz.aqlabs.ForecastApp.Services;

import xyz.aqlabs.ForecastApp.Models.Forecast.PeriodsObject;

import java.util.List;
import java.util.Scanner;

public class UserInterfaceService {

    WeatherService weatherService = new WeatherService();
    ForecastService forecastService = new ForecastService();


    public void userMain(){

        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("      AQLabs Weather Forecast");
        System.out.println("----------------------------------");
        System.out.print("Please enter your Address(123 Main st, city ST): ");
        String address = scan.nextLine();
        System.out.println("----------------------------------");
        System.out.println("Please choose your Forecast Size");
        System.out.println("[1] - Today's Forecast");
        System.out.println("[2] - 3 Day Forecast");
        System.out.println("[3] - 6 Day Forecast");
        System.out.println("----------------------------------");
        System.out.print("Your choice is: ");
        int choice = scan.nextInt();
        scan.nextLine();
        try{
            switch(choice){
                case 1 :{
                    System.out.println(printPeriods(forecastService.getForecast(weatherService.getCoordinates(address)),address));
                    break;
                }
                case 2 :{
                    List<PeriodsObject> periodsObjectList = forecastService.getListOfForecasts(weatherService.getCoordinates(address));
                    for(int i = 0; i < periodsObjectList.size()/2;i++){
                        System.out.println(printPeriods(periodsObjectList.get(i),address));
                    }
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Wrong Input Try Again");
            userMain();
        }
    }

    private String printPeriods(PeriodsObject periodsObject, String address){
       return "----------------------------------\n"+
               "Forecast for ->: \n"+
               "Date is: "+periodsObject.getName()+"\n"+
               "Temperature  ->: "+periodsObject.getTemperature()+" "+periodsObject.getTemperatureUnit()+"\n"+
               "Wind speed   ->: "+periodsObject.getWindSpeed()+"\n"+
               "Details:     ->: "+periodsObject.getDetailedForecast();
    }

}


