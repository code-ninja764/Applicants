package com.example.applicants.businessLogic;

import org.springframework.stereotype.Service;

import static com.example.applicants.businessLogic.VehicleTypeFactor.typeFactor;

@Service
public class BusinessLogic {

public double calculateQuote(Double typeFactor, Double engineSizeFactor, Double additionalDriversFactor,
                             Double commercialUseFactor, Double outsideStateFactor, Double vehicleValueFactor) {
    double typeFactor1 = typeFactor("applicant.getVehicleType");

    return (100*typeFactor1*engineSizeFactor*additionalDriversFactor*commercialUseFactor*outsideStateFactor*vehicleValueFactor);

    }
}
