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

class Rectangle extends shape{
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


