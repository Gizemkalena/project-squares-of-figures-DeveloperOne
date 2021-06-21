package app.entities;

public class Circle {
    private double Radius;


    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public double calculateArea(){
        return (3.14*(getRadius()*getRadius()));
    }
}
