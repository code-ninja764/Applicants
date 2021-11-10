package com.example.applicants.service.businessLogic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTypeFactorTest {

    //Setup test variables
    String validCarType, invalidCarType;

    //Instantiation of method
    VehicleTypeFactor vehicleTypeFactor;

    @BeforeEach
    void setUp() {
        validCarType = "hatchback";
        invalidCarType = "Invalid";

        vehicleTypeFactor = new VehicleTypeFactor();


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void typeFactorValid() {
        double expectedResult = 1.6;
        double actualResult = vehicleTypeFactor.typeFactor(validCarType);

        assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    void typeFactorInvalid() {

        IllegalArgumentException exception =
        assertThrows(IllegalArgumentException.class, () -> {vehicleTypeFactor.typeFactor(invalidCarType);});
    }
}