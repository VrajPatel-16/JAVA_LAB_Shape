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