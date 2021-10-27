package com.example.applicants.businessLogic;

public class AdditionalDriversFactor {

    public double additionalDriversFactor(String additionalDrivers) {

        double additionalDriverFactor = 0.0;
        int additionalDriversInt = Integer.parseInt(additionalDrivers);

        try{
            if (additionalDriversInt >=0 && additionalDriversInt <2){
                return additionalDriverFactor = 1.1;
            }
            else {
                return additionalDriverFactor = 1.2;
            }

        } catch (NumberFormatException e){
            throw new NumberFormatException("String cannot be converted to int");
        }


    }
}
