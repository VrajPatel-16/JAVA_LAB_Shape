//Circle.java

// Class for Circle, inherits from Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");  // Calls the parent class constructor
        this.radius = radius;
    }