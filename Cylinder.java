//Cylinder.java

// Class for Cylinder, inherits from Shape and implements Volume
class Cylinder extends Shape implements Volume {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Implement area calculation (Surface Area)
    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Cylinder does not have a perimeter
    @Override
    double calculatePerimeter() {
        return 0;
    }

    // Implement volume calculation
    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
