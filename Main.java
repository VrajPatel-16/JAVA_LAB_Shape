//Main.java

// Name:- Vraj Patel
// PRN:- 23070126147
// Batch:- AIML-B3

// Import Scanner for user input
import java.util.Scanner;

// Main class with menu-driven program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\n===== Shape Calculation Menu =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Shape shape = null;  // Declare shape variable

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;

                case 3:
                    System.out.print("Enter side length of the square: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;

                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    sphere.display();
                    System.out.println("Volume: " + sphere.calculateVolume());
                    continue;

                case 5:
                    System.out.print("Enter radius of the cylinder: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double cylHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
                    cylinder.display();
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    continue;

                case 6:
                    System.out.print("Enter base length of the pyramid: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double height = scanner.nextDouble();
                    EquilateralPyramid pyramid = new EquilateralPyramid(base, height);
                    pyramid.display();
                    System.out.println("Volume: " + pyramid.calculateVolume());
                    continue;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

            if (shape != null) {
                shape.display();
            }

        } while (choice != 0);

        scanner.close();
    }
}
