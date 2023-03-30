import javax.xml.XMLConstants;

abstract class shape {
    // coordinates for the center of the shape. NOT THE REQUIRED WAY, SIMPLY A PLACE HOLDER
    int x, y;

    shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // function to calculate the perimeter of the shape
    abstract double perimeter();

    // function to calculate the area of the shape
    abstract double area();

    // function to check if a position is in a shape
    abstract boolean contains(int x, int y);
}

//Class Square inherits from the parent class
class Square extends shape{
    int side;
    //constructor for the Square class
    public Square(int x, int y, int side){
        super(x, y);
        this.side = side;
    }
    //method to find the area of a Square
    public double area(){
        return side*side;
    } 
    //method to find the perimeter of a Square
    public double perimeter(){
        return 4 * side;
    }
    // method to check if a position is contained in the square
    boolean contains(int x, int y) {
        int halfSide = side / 2;
        return (x >= this.x - halfSide && x <= this.x + halfSide)
                && (y >= this.y - halfSide && y <= this.y + halfSide);
    }
}

//Class Rectangle inherits from the parent class shape
class Rectangle extends shape{
    int length;
    int width;
    //constructor of the Rectangle class
    public Rectangle(int x, int y, int length, int width){
        super(x, y);
        this.length = length;
        this.width = width;
    }
    //method to find the area of the Rectangle
    public double area(){
        return length * width;
    }
    //method to find the perimeter of the perimeter of the Rectangle
    public double perimeter(){
        return 2*(length + width);
    }
    // method to check if a position is contained in the rectangle
    boolean contains(int x, int y) {
        int halfLength = length / 2;
        int halfWidth = width / 2;
        return (x >= this.x - halfLength && x <= this.x + halfLength)
                && (y >= this.y - halfWidth && y <= this.y + halfWidth);
    }
}
//Class Circle inherits from the parent class shape
class Circle extends shape{
    int radius;
    //construcing the class circle
    public Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }
        //method to find the area of a Circle
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    // method to check if a position is contained in the circle
    boolean contains(int x, int y) {
        int dx = x - this.x;
        int dy = y - this.y;
        return dx * dx + dy * dy <= radius * radius;
    }
}

class Posn{
    int x;
    int y;
    public Posn(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}