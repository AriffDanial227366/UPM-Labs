import java.util.Scanner; // Imports scanner
import java.lang.Math; // Imports math for square root

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialise scanner as "scanner" variable
        System.out.println("What is a?"); // Prompts for user input of a and save as variable
        double a = scanner.nextDouble();
        System.out.println("\nWhat is b?"); // Prompts for user input of b and save as variable
        double b = scanner.nextDouble();
        double c = Math.sqrt((a * a) + (b * b)); // Math to get c with square root from Math lang
        double perimeter = a + b + c; // Formula to get perimeter
        double area = (a * b) / 2; // Formula to get area
        System.out.println("\nThe perimeter of the right triangle, given a = " + a + " and b = " + b + " is:\n" + perimeter + " unit(s)"); // Perimeter answer
        System.out.println("\nThe area of the right angle likewise is:\n" + area + " unit(s)"); // Area answer
    }
}
