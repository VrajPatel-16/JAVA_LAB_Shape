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