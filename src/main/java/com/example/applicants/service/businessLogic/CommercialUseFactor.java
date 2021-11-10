package com.example.applicants.service.businessLogic;

public class CommercialUseFactor {

    public static double commercialUseFactor(String commercialUse) {

        double commercialUseFactor = 0.0;

        if (commercialUse.equalsIgnoreCase("true")){
            return commercialUseFactor = 1.1;
        }
        if (commercialUse.equalsIgnoreCase("false")){
            return commercialUseFactor = 1.0;
        }
        else {
            throw new IllegalArgumentException("Invalid Entry");
        }
    }
}
