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

    @Test
    void testPost() {


        //Given
        Float defaultYards = 69F;

        //When
        this.conversionService.setYards(defaultYards);
        //No number has yet been set.

        //Then
        assertEquals(defaultYards, conversionService.getYards());

    }

    @Test
    void testConversion() {


        //Given
        Float Yards = 69F;

        //When
        this.conversionService.setYards(Yards);
        //this.conversionService.getYardToMeters();
        //No number has yet been set.

        //Then
        assertEquals(Yards / 1.094F, conversionService.getYardToMeters());

    }

}
