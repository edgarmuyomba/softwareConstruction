package Tina;
import java.lang.Math;
import Shape.shape;
import Ian.Posn;

// Class Circle inherits from the parent class shape
public class Circle extends shape {
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

    public String toString() {
        return "Circle";
    }
}