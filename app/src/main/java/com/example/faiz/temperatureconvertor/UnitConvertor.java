package com.example.faiz.temperatureconvertor;

/**
 * Created by Faiz on 3/5/2017.
 */
public class UnitConvertor {
    public static double CelsiusToFarenhit(double c){
        return 9*c/5+32;
    }
    public static double FarenhitToCelsius(double f){
        return 5*((f-32)/9) ;


    }

}
