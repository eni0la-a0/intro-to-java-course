package com.cbfacademy.cars;

public class Car {
    
    
    private String make;
    private String model;
    private String colour;
    private int year;

    public Car(String make, String model, String colour, int year){}
    // constructor example from lesson on 26/11/24

    public String getMake() {
    return make;  
    }
    public String getModel() {
        return model;
    }
    public String getColour() {
        return colour;
    }
    public int getYear() {
        return year;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }


   
    public String getDetails() {
        String details = String.format(
        "This is a %s, %i, %s, from %s",
        this.colour, this.year, this.model, this.colour, this.make
        );
        return details;
    }
    
}
