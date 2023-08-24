package entities;

import first_interface.figuraGeometrica;

public class circle implements figuraGeometrica {

    private Double radius;

    public circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public  Double getArea(){
        return (radius * radius) * 3.14;
    }

    public Double getPerimeter(){
        return 2 * 3.14 * radius;
    }

}
