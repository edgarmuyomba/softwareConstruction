package Ian;
import Shape.shape;

public class Rectangle extends shape{
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

    public String toString() {
        return "Rectangle";
    }
}
