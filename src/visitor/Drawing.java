package visitor;

import java.util.ArrayList;
import java.util.List;

// Drawing class to hold a collection of shapes
public class Drawing {
    private List<Shape> shapes = new ArrayList<>();

    // Add shapes to the drawing
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    // Use a visitor to calculate areas for all shapes
    public void calculateAreas(Visitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}

