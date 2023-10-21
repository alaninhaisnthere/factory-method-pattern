package factories;

import shapes.Shape;
import shapes.Square;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
