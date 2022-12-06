package fhtw.Inch_To_Centimeter_And_Yard_To_Meter.dto;

public class Conversions {

    private float centimeters = 0;
    private float meters = 0;
    private float inches = 0;
    private float yards = 0;


    public void setInches(float inches) {

        this.inches = inches;

    }

    public void setYards(float yards) {

        this.yards = yards;

    }

    public float getCentimeters(){
        return this.centimeters;
    }

    public float getMeters(){
        return this.meters;
    }

    public float getInches(){
        return this.inches;
    }

    public float getYards(){
        return this.yards;
    }

    public float getInchToCentimeters() {

        this.centimeters = this.inches * 2.54F;

        return this.centimeters;

    }

    public float getYardToMeters() {

        if (this.yards != 0){

            this.meters = this.yards / 1.094F;

            return this.meters;

        } else return 0;

    }

}
