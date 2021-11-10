package com.example.applicants.service.businessLogic;

import com.example.applicants.model.Applicant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestQuoteAmount {

    Double typeFactor, engineSizeFactor, additionalDriversFactor, commercialUseFactor, outsideStateFactor, vehicleValueFactor,
            typeFactor2, engineSizeFactor2, additionalDriversFactor2, commercialUseFactor2, outsideStateFactor2, vehicleValueFactor2;
    QuoteAmountCalculator quoteAmountCalculator;
    Applicant applicant;
    Applicant applicant2;

    @BeforeEach
    void setUp(){

//        typeFactor = 1.3;
//        engineSizeFactor = 1.0;
//        additionalDriversFactor = 1.0;
//        commercialUseFactor = 1.1;
//        outsideStateFactor = 1.1;
//        vehicleValueFactor = 1.0;
//
//        typeFactor2 = 1.4;
//        engineSizeFactor2 = 1.6;
//        additionalDriversFactor2 = 1.2;
//        commercialUseFactor2 = 1.0;
//        outsideStateFactor2 = 1.0;
//        vehicleValueFactor2 = 1.2;

        //businessLogic Object
        quoteAmountCalculator = new QuoteAmountCalculator();
        applicant = new Applicant(3L, "prefix", "firstName", "lastName", "telephone", "address1", "address2",
                "city", "postcode","Hatchback", "1000", "1", "true", "false", "date",
                "10000", "N/A", 0.0 );

        applicant2 = new Applicant(3L, "prefix", "firstName", "lastName",
                "telephone", "address1", "address2",
                "city", "postcode","Cabriolet", "3000", "1",
                "false", "false", "date",
                "15000", "N/A", 0.0 );

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateQuote1() {


        //double expectedResult =  (100 * typeFactor * engineSizeFactor * additionalDriversFactor * commercialUseFactor * outsideStateFactor * vehicleValueFactor);
        double expectedResult = 232.32;

        quoteAmountCalculator.calculateQuote(applicant);

        assertEquals(expectedResult, applicant.getQuoteAmount() , 0.2);
    }

   @Test
    void calculateQuote2(){

        double expectedResult = 514.80;

        quoteAmountCalculator.calculateQuote(applicant2);

        assertEquals(expectedResult, applicant2.getQuoteAmount(), 0.2);
    }


}