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
    public static boolean contains(shape Shape, Posn position) {
        if (Shape instanceof Square) {
            // logic to check if coordinates lie within a square
            Square square = (Square) Shape; // casting the shape to a square
            double halfSide = square.getSide() / 2;
            double bottomX = square.getCenter().getX() - halfSide;
            double bottomY = square.getCenter().getY() - halfSide;
            double topX = square.getCenter().getX() + halfSide;
            double topY = square.getCenter().getY() + halfSide;
            if ((position.getX() >= bottomX) && (position.getX() <= topX) && (position.getY() >= bottomY)
                    && (position.getY() <= topY)) {
                return true;
            } else
                return false;
        } else if (Shape instanceof Rectangle) {
            // logic to check if coordinates lie within a rectangle
            Rectangle rectangle = (Rectangle) Shape; // casting the shape to a rectangle
            double halfLength = rectangle.getLength() / 2;
            double halfWidth = rectangle.getWidth() / 2;
            double bottomX = rectangle.getCenter().getX() - halfLength;
            double bottomY = rectangle.getCenter().getY() - halfLength;
            double topX = rectangle.getCenter().getX() + halfWidth;
            double topY = rectangle.getCenter().getY() + halfWidth;
            if ((position.getX() >= bottomX) && (position.getX() <= topX) && (position.getY() >= bottomY)
                    && (position.getY() <= topY)) {
                return true;
            } else
                return false;
        } else if (Shape instanceof Circle) {
            // logic to check if coordinates lie within a circle
            Circle circle = (Circle) Shape; // casting the shape to a circle
            double x = circle.getCenter().getX();
            double y = circle.getCenter().getY();
            double radius = circle.getRadius();
            double result = Math.pow((position.getX() - x), 2) + Math.pow((position.getY() - y), 2);
            if (result < Math.pow(radius, 2)) {
                return true;
            } else
                return false;
        } else {
            return false;
        }
    }

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