import java.util.Scanner; // Imports scanner
import java.lang.Math; // Imports math for square root

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialise scanner as "scanner" variable
        System.out.println("What is a?"); // Prompts for user input of a and save as variable
        double a = scanner.nextDouble();
        System.out.println("\nWhat is b?"); // Prompts for user input of b and save as variable
        double b = scanner.nextDouble();
        System.out.println("\nThe perimeter of the right triangle, given a = " + a + " and b = " + b + " is:\n" + perimeter(a, b) + " unit(s)"); // Perimeter answer after calling perimeter method
        System.out.println("\nThe area of the right angle likewise is:\n" + area(a, b) + " unit(s)"); // Area answer after calling area method
    }

    // Method for calculating perimeter
    public static double perimeter(double a, double b) {
        double c = Math.sqrt((a*a) + (b*b)); // Formula with square root from importing Math
        return a + b + c; // Returns answer
    }

    // Method for calculating area
    public static double area(double a, double b) {
        return (a * b) / 2; // Returns answer
    }
}
