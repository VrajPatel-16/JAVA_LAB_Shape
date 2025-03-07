//Sphere.java

// Class for Sphere, inherits from Shape and implements Volume
class Sphere extends Shape implements Volume {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Implement area calculation (Surface Area)
    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Sphere does not have a perimeter
    @Override
    double calculatePerimeter() {
        return 0;
    }

    // Implement volume calculation
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
