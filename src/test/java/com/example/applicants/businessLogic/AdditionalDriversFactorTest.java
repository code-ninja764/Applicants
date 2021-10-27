package com.example.applicants.businessLogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionalDriversFactorTest {

    //Set up test variables
    String validAdditionalDrivers, invalidAdditionalDrivers, validAdditionalDriversLower, validAdditionalDriversUpper;

    //Instasiation of method
    AdditionalDriversFactor additionalDriversFactor;

    @BeforeEach
    void setUp() {

        validAdditionalDriversLower = "1";
        validAdditionalDriversUpper = "2";
        invalidAdditionalDrivers = "Invalid";

        //additonalDriversFactor Object
        additionalDriversFactor = new AdditionalDriversFactor();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void additionalDriversFactorValidLower() {
        double expectedResult = 1.1;

        double actualResult = additionalDriversFactor.additionalDriversFactor(validAdditionalDriversLower);

        assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    void additionalDriversFactorValidUpper() {
        double expectedResult = 1.2;

        double actualResult = additionalDriversFactor.additionalDriversFactor(validAdditionalDriversUpper);

        assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    void additionalDriversFactorInvalid() {
       NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {additionalDriversFactor.additionalDriversFactor(invalidAdditionalDrivers);});
    }
}









