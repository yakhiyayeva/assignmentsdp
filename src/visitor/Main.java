package visitor;

public class Main {
    public static void main(String[] args) {
        // Create some shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 7);
        Triangle triangle = new Triangle(3, 6);

        // Add them to a Drawing
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        // Create an AreaCalculator visitor
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate the area of all shapes in the drawing
        System.out.println("Calculating areas:");
        drawing.calculateAreas(areaCalculator);
    }
}

