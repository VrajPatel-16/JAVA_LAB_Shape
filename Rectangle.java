//Rectangle.java

// Class for Rectangle, inherits from Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Implement area calculation for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implement perimeter calculation for Rectangle
    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}