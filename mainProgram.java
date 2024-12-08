import shapes.Rectangle;  // Importing the Rectangle class
import shapes.Circle;     // Importing the Circle class
import java.util.Scanner; // Importing Scanner for user input

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle area calculation
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle();
        System.out.println("Area of the rectangle: " + rectangle.calculateArea(length, breadth));

        // Circle area calculation
        System.out.println("\nEnter the radius of the circle:");
        double radius = scanner.nextDouble();

        Circle circle = new Circle();
        System.out.println("Area of the circle: " + circle.calculateArea(radius));
    }
}

