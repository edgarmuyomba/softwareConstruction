import java.lang.Math;

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
        
    }
}
