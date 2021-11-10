package com.example.applicants.service.businessLogic;

public class OutsideStateUseFactor {

    public static double outsideStateUseFactor(String outsideStateUse) {

        double outsideStateUseFactor = 0.0;

        if (outsideStateUse.equalsIgnoreCase("true")){
            return outsideStateUseFactor = 1.1;
        }
        if (outsideStateUse.equalsIgnoreCase("false")){
            return outsideStateUseFactor = 1.0;
        }
        else {
            throw new IllegalArgumentException("Invalid Entry");
        }
    }
}
