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