//EquilateralPyramid.java

// Class for Equilateral Pyramid, inherits from Shape and implements Volume
class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    // Constructor
    public EquilateralPyramid(double base, double height) {
        super("Equilateral Pyramid");
        this.base = base;
        this.height = height;
    }