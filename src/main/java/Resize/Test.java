package Resize;

public class Test {
    public static void main(String[] args) {
        Circle circle= new Circle(15);
        int percent;
        percent= (int) (Math.random()*100);
        circle.resize(percent);
        circle.toString();
        Square square= new Square();
        square.howtoColor();

    }
}
