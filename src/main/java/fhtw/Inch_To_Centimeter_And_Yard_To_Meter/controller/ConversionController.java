package fhtw.Inch_To_Centimeter_And_Yard_To_Meter.controller;

import fhtw.Inch_To_Centimeter_And_Yard_To_Meter.service.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService) {

        this.conversionService = conversionService;

    }

    //All Posts

    @PostMapping("/setInch/{inches}")
    Float setInches(@PathVariable Float inches) {

        conversionService.setInches(inches);

        return inches;

    }

    @PostMapping("/setYard/{yards}")
    Float setYard(@PathVariable Float yards) {

        conversionService.setYards(yards);

        return yards;

    }



    //All Gets

    @GetMapping("/getCentimeters")
    Float getCentimeters() {

        return conversionService.getCentimeters();

    }

    @GetMapping("/getCentimeters")
    Float getMeters() {

        return conversionService.getMeters();

    }

    @GetMapping("/getInches")
    Float getInches() {

        return conversionService.getInches();

    }

    @GetMapping("/getYards")
    Float getYards() {

        return conversionService.getYards();

    }

}
