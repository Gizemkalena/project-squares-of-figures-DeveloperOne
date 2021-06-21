package app.entities;

public class Trapezoid {
    private double side_A;
    private double side_B;
    private double hight_H;

    public double getSide_A() {
        return side_A;
    }

    public void setSide_A(double side_A) {
        this.side_A = side_A;
    }

    public double getSide_B() {
        return side_B;
    }

    public void setSide_B(double side_B) {
        this.side_B = side_B;
    }

    public double getHight_H() {
        return hight_H;
    }

    public void setHight_H(double hight_H) {
        this.hight_H = hight_H;
    }

    public double calculateArea(){
        return (0.5*(getSide_A()+getSide_B())*getHight_H());
    }
}
