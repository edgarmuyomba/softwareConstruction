package Allan;
import Ian.*;
import Shape.shape;
import Tina.*;

public class shapeContains {
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
}