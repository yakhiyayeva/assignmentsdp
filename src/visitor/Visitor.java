package visitor;

// Visitor interface with visit methods for each shape
public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}

