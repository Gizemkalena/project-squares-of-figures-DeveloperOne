package app.entities;

public class Square {
    private double side_A;

    public double getSide_A() {
        return side_A;
    }

    public void setSide_A(double side_A) {
        this.side_A = side_A;
    }

    public double calculateArea(){
        return (getSide_A()*getSide_A());
    }
}
