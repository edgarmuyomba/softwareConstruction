import java.lang.Math;
import Shape contains.*;
// parent class to the rest of the shape objects
abstract class shape {
    // coordinates for the center of the shape
    private Posn center;

    shape(Posn center) {
        this.center = center;
    }

    // function to calculate the perimeter of the shape
    abstract double perimeter();

    // function to calculate the area of the shape
    abstract double area();

    // getter to return the center
    public Posn getCenter() {
        return center;
    }
}

// Class Square inherits from the parent class
class Square extends shape {
    private double side;

    // constructor for the Square class
    public Square(Posn center, double side) {
        super(center);
        this.side = side;
    }

    // method to find the area of a Square
    public double area() {
        return side * side;
    }

    // method to find the perimeter of a Square
    public double perimeter() {
        return 4 * side;
    }

    // getter to return side
    public double getSide() {
        return side;
    }
}

// Class Rectangle inherits from the parent class shape
class Rectangle extends shape {
    private double length;
    private double width;

    // constructor of the Rectangle class
    public Rectangle(Posn center, double length, double width) {
        super(center);
        this.length = length;
        this.width = width;
    }

    // method to find the area of the Rectangle
    public double area() {
        return length * width;
    }

    // method to find the perimeter of the perimeter of the Rectangle
    public double perimeter() {
        return 2 * (length + width);
    }

    // getter to return length
    public double getLength() {
        return length;
    }

    // getter to return width
    public double getWidth() {
        return width;
    }
}

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

class Posn {
    private double x;
    private double y;

    public Posn(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
