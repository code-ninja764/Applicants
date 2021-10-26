package com.example.applicants.businessLogic;

public class VehicleValueFactor {

    public double valueFactor(String currentValue) {

        double vehicleValueFactor = 0.0;
        int currentValueInt = Integer.parseInt(currentValue);

        if (currentValueInt <= 5000){
            return vehicleValueFactor = 1.0;
        }
        else {
            return vehicleValueFactor = 1.2;
        }
    }
}

