//Circle.java

// Class for Circle, inherits from Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");  // Calls the parent class constructor
        this.radius = radius;
    }

    // Implement area calculation for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement perimeter calculation for Circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}