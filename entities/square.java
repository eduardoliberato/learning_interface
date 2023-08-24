package entities;


import first_interface.figuraGeometrica;

public class square implements figuraGeometrica {

    private double side;
    

    public square(double side) {
        
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override

    public String getName() {

        return "Square";
    }

    @Override

    public Double getArea() {
        return side * side;
    }

    @Override

    public Double getPerimeter() {
        return 4 * side;
    }
}
