import java.lang.Math;

abstract class shape {
    // coordinates for the center of the shape
    Posn center;

    shape(Posn center) {
        this.center = center;
    }

    // function to calculate the perimeter of the shape
    abstract double perimeter();

    // function to calculate the area of the shape
    abstract double area();
}

// Position class to hold coordinates x and y
class Posn {
    double x, y;
    Posn(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

// Class Square inherits from the parent class
class Square extends shape {
    double side;

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
}

// Class Rectangle inherits from the parent class shape
class Rectangle extends shape {
    double length;
    double width;

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
}

// Class Circle inherits from the parent class shape
class Circle extends shape {
    int radius;

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

}

public class assignment2 {
    public static boolean contains (shape Shape, Posn position) {
        if (Shape instanceof Square) {
            // logic to check if coordinates lie within a square
            Square square = (Square) Shape;
            double halfSide = square.side / 2;
            double bottomX = square.center.x - halfSide;
            double bottomY = square.center.y - halfSide;
            double topX = square.center.x + halfSide;
            double topY = square.center.y + halfSide;
            if ((position.x >= bottomX) && (position.x <= topX) && (position.y >= bottomY) && (position.y <= topY)) {
                return true;
            } else return false;
        } else if (Shape instanceof Rectangle) {
            // logic to check if coordinates lie within a rectangle
            Rectangle rectangle = (Rectangle) Shape;
            double halfLength = rectangle.length / 2;
            double halfWidth = rectangle.width / 2;
            double bottomX = rectangle.center.x - halfLength;
            double bottomY = rectangle.center.y - halfLength;
            double topX = rectangle.center.x + halfWidth;
            double topY = rectangle.center.y + halfWidth;
            if ((position.x >= bottomX) && (position.x <= topX) && (position.y >= bottomY) && (position.y <= topY)) {
                return true;
            } else return false;
        } else if (Shape instanceof Circle) {
            // logic to check if coordinates lie within a circle
            Circle circle = (Circle) Shape;
            double x = circle.center.x;
            double y = circle.center.y;
            double radius = circle.radius;
            double result = Math.pow((position.x - x), 2) + Math.pow((position.y - y), 2);
            if (result < Math.pow(radius, 2)) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Square square1 = new Square(new Posn(0, 0), 4);
        Circle circle1 = new Circle(new Posn(3, -1), 5);
        Rectangle rect1 = new Rectangle(new Posn(0, 0), 6, 4);
        System.out.println("Point (2,2) in square1?: " + contains(square1, new Posn(2, 2)));
        System.out.println("Point (6, 0) in circle1?: " + contains(circle1, new Posn(6, 0)));
        System.out.println("Point (2,2) in rect1?: " + contains(rect1, new Posn(2, 2)));
    }
}