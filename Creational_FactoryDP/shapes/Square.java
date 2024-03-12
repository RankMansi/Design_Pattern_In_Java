package shapes;
import java.util.Scanner;

public class Square implements Shape {
    public double side;
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the side length
        System.out.print("Enter the side length of the square: ");
        this.side = scanner.nextDouble();

        // Calculate and display the area
        double area = side * side;
        System.out.println("Area of Square: " + area);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
