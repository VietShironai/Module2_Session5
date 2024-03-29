package Comparator;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(){};
    public Circle( double radius){
        this.radius= radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius= radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;

    }
    public boolean isFilled(){
        return filled;
    }
    public  void setFilled(){
        this.filled=filled;
    }
    public Circle(double radius, String color, boolean filled) {

        this.radius = radius;
        this.color=color;
        this.filled=filled;

    }
}
