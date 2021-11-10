package com.example.applicants.service.businessLogic;

import com.example.applicants.model.Applicant;
import org.springframework.stereotype.Service;

import static com.example.applicants.service.businessLogic.AdditionalDriversFactor.additionalDriversFactor;
import static com.example.applicants.service.businessLogic.CommercialUseFactor.*;
import static com.example.applicants.service.businessLogic.EngineSizeFactor.sizeFactor;
import static com.example.applicants.service.businessLogic.OutsideStateUseFactor.*;
import static com.example.applicants.service.businessLogic.VehicleTypeFactor.typeFactor;
import static com.example.applicants.service.businessLogic.VehicleValueFactor.*;

@Service
public class QuoteAmountCalculator {

public void calculateQuote(Applicant newApplicant) {
    double typeFactor = typeFactor(newApplicant.getVehicleType());
    double engineSizeFactor = sizeFactor(newApplicant.getEngineSize());
    double additionalDriversFactor = additionalDriversFactor(newApplicant.getAdditionalDrivers());
    double commercialUseFactor = commercialUseFactor(newApplicant.getCommercialPurposes());
    double outsideStateFactor = outsideStateUseFactor(newApplicant.getUsedOutsideState());
    double vehicleValueFactor = valueFactor(newApplicant.getCurrentValue());

    double quoteAmount = (100*typeFactor*engineSizeFactor*additionalDriversFactor*commercialUseFactor*outsideStateFactor*vehicleValueFactor);
    newApplicant.setQuoteAmount(quoteAmount);
    //return (100*typeFactor*engineSizeFactor*additionalDriversFactor*commercialUseFactor*outsideStateFactor*vehicleValueFactor);

    }
}
