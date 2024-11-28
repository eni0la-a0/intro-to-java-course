package com.cbfacademy.shapes;

public class Sphere extends Shapes {
    
    private double radius; // created radius as a field //
    
    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * (this.radius * this.radius);
    }

}
