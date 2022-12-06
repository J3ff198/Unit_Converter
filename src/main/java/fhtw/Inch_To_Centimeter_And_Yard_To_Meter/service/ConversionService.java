package fhtw.Inch_To_Centimeter_And_Yard_To_Meter.service;

import fhtw.Inch_To_Centimeter_And_Yard_To_Meter.dto.Conversions;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ConversionService {

    private final Conversions conversions = new Conversions();

    public void setInches(Float inches) {

        conversions.setInches(inches);

    }

    public void setYards(Float yards) {

        conversions.setYards(yards);

    }

    public Float getCentimeters(){
        return this.conversions.getCentimeters();
    }

    public Float getMeters(){
        return this.conversions.getMeters();
    }

    public Float getInches(){
        return this.conversions.getInches();
    }

    public Float getYards(){
        return this.conversions.getYards();
    }



}
