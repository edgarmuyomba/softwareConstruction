package Ian;
import Shape.shape;

// Class Square inherits from the parent class
public class Square extends shape {
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

    public String toString() {
        return "Square";
    }
}