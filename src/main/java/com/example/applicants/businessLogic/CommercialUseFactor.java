package com.example.applicants.businessLogic;

public class CommercialUseFactor {

    public double commercialUseFactor(String commercialUse) {

        double commercialUseFactor = 0.0;

        if (commercialUse.equalsIgnoreCase("Yes")){
            return commercialUseFactor = 1.1;
        }
        if (commercialUse.equalsIgnoreCase("No")){
            return commercialUseFactor = 1.0;
        }
        else {
            throw new IllegalArgumentException("Invalid Entry");
        }
    }
}
