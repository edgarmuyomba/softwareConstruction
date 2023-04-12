package Shape;
import Ian.Posn;

public abstract class shape {
    // coordinates for the center of the shape
    private Posn center;

    public shape(Posn center) {
        this.center = center;
    }

    // function to calculate the perimeter of the shape
    public abstract double perimeter();

    // function to calculate the area of the shape
    public abstract double area();

    // getter to return the center
    public Posn getCenter() {
        return center;
    }
}
