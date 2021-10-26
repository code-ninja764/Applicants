package com.example.applicants.businessLogic;

public class EngineSizeFactor {

    public double sizeFactor(String engineSize) {

        double engineSizeFactor = 0.0;

        if (engineSize.equalsIgnoreCase("1000")) {
            return engineSizeFactor = 1.0;
        } else if (engineSize.equalsIgnoreCase("1600")) {
            return engineSizeFactor = 1.6;
        } else if (engineSize.equalsIgnoreCase("2000")) {
            return engineSizeFactor = 2.0;
        } else if (engineSize.equalsIgnoreCase("2500")) {
            return engineSizeFactor = 2.5;
        } else if (engineSize.equalsIgnoreCase("3000")) {
            return engineSizeFactor = 3.0;
        } else if (engineSize.equalsIgnoreCase("other")) {
            return engineSizeFactor = 3.5;
        } else {
            return engineSizeFactor = 0.0;
        }
    }
}

