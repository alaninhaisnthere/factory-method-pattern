package factories;

import shapes.Circle;
import shapes.Shape;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
