package com.example.applicants.businessLogic;

public class OutsideStateUseFactor {

    public double outsideStateUseFactor(String outsideStateUse) {

        double outsideStateUseFactor = 0.0;

        if (outsideStateUse.equalsIgnoreCase("Yes")){
            return outsideStateUseFactor = 1.1;
        }
        if (outsideStateUse.equalsIgnoreCase("No")){
            return outsideStateUseFactor = 1.0;
        }
        else {
            return outsideStateUseFactor = 0.0;
        }
    }
}
