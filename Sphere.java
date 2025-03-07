//Sphere.java

// Class for Sphere, inherits from Shape and implements Volume
class Sphere extends Shape implements Volume {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
