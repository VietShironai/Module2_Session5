package Resize;
import   Resize.Resizeable;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(int percent){
        radius = radius * percent/100;
        System.out.println(" circle is changed with radius is "+ getRadius()+ " and percent is "+ percent+ "%");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

