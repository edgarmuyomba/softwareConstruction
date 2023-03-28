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
}