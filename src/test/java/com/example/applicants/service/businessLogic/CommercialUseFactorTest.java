package com.example.applicants.service.businessLogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommercialUseFactorTest {

    //Setup
    String validYes, validNo, invalid;

    //Creating
    CommercialUseFactor commercialUseFactor;

    @BeforeEach
    void setUp() {
        //Setup test data
        validYes = "true";
        validNo = "false";
        invalid = "Invalid";

        commercialUseFactor = new CommercialUseFactor();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void commercialUseFactorValidYes() {
        double expectedResult = 1.1;
        double actualResult = commercialUseFactor.commercialUseFactor(validYes);

        assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    void commercialUseFactorValidNo() {
        double expectedResult = 1.0;
        double actualResult = commercialUseFactor.commercialUseFactor(validNo);

        assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    void commercialUseFactorInvalid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {commercialUseFactor.commercialUseFactor(invalid);});
    }
}