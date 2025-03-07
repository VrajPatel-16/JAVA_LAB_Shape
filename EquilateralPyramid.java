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

    // Implement area calculation
    @Override
    double calculateArea() {
        return base * base + 2 * base * Math.sqrt((base * base / 4) + (height * height));
    }

    // Implement perimeter calculation
    @Override
    double calculatePerimeter() {
        return 4 * base;
    }

    // Implement volume calculation
    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * base * base * height;
    }
}
