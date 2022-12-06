package fhtw.Inch_To_Centimeter_And_Yard_To_Meter.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionServiceTest {

    private final ConversionService conversionService = new ConversionService();

    @Test
    void testGetDefault() {


        //Given
        Float defaultCentimeters = 0F;

        //When
        //No number has yet been set.

        //Then
        assertEquals(defaultCentimeters, conversionService.getCentimeters());

    }

}
