//Shape.java

// Abstract class representing a general shape
abstract class Shape {
    protected String shapeName;

    // Constructor to initialize the shape name
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods to be implemented by subclasses
    abstract double calculateArea();
    abstract double calculatePerimeter();

    // Display shape details
    public void display() {
        System.out.println("\nShape: " + shapeName);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
