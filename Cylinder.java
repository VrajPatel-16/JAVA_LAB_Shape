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