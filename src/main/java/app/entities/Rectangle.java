package app.entities;

public class Rectangle {
    private double side_A;
    private double side_B;

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

    public double calculateArea(){
        return (getSide_A()*getSide_B());
    }
}
