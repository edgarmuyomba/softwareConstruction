import java.lang.Math;
import Ian.*;
import Shape.shape;
import Tina.*;
import Allan.*;

public class assignment2 {
    public static void main(String[] args) {
        Square square1 = new Square(new Posn(0, 0), 4);
        Circle circle1 = new Circle(new Posn(3, -1), 5);
        Rectangle rect1 = new Rectangle(new Posn(0, 0), 6, 4);
        System.out.println("Area of square1: " + square1.area() + "  Perimeter of square1: " + square1.perimeter());
        System.out.println("Point (2,2) in square1?: " + shapeContains.contains(square1, new Posn(2, 2)));
        System.out.println("Area of circle1: " + circle1.area() + "  Perimeter of circle1: " + circle1.perimeter());
        System.out.println("Point (6,0) in circle1?: " + shapeContains.contains(circle1, new Posn(6, 0)));
        System.out.println("Area of rectangle1: " + rect1.area() + "  Perimeter of rectangle1: " + rect1.perimeter());
        System.out.println("Point (2,2) in rect1?: " + shapeContains.contains(rect1, new Posn(2, 2)));
    }
}