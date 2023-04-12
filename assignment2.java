import java.lang.Math;
import Ian.*;
import Shape.*;

// Class Circle inherits from the parent class shape
class Circle extends shape {
    private double radius;

    // construcing the class circle
    public Circle(Posn center, int radius) {
        super(center);
        this.radius = radius;
    }

    // method to find the area of a Circle
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // getter to return the radius
    public double getRadius() {
        return radius;
    }
}

public class assignment2 {
    public static void main(String[] args) {
        Square square1 = new Square(new Posn(0, 0), 4);
        Circle circle1 = new Circle(new Posn(3, -1), 5);
        Rectangle rect1 = new Rectangle(new Posn(0, 0), 6, 4);
        System.out.println("Area of square1: " + square1.area() + "  Perimeter of square1: " + square1.perimeter());
        System.out.println("Point (2,2) in square1?: " + contains(square1, new Posn(2, 2)));
        System.out.println("Area of circle1: " + circle1.area() + "  Perimeter of circle1: " + circle1.perimeter());
        System.out.println("Point (6,0) in circle1?: " + contains(circle1, new Posn(6, 0)));
        System.out.println("Area of rectangle1: " + rect1.area() + "  Perimeter of rectangle1: " + rect1.perimeter());
        System.out.println("Point (2,2) in rect1?: " + contains(rect1, new Posn(2, 2)));
    }
}