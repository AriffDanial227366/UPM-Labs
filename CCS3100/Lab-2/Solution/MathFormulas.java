import java.util.Scanner; // Imports scanner

public class MathFormulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialise scanner as "scanner" variable
        System.out.println("What is a?"); // Prompts for user input of a and save as variable
        double a = scanner.nextDouble();
        System.out.println("\nWhat is b?"); // Prompts for user input of b and save as variable
        double b = scanner.nextDouble();
        System.out.println("\nWhat is c?"); // Prompts for user input of c and save as variable
        double c = scanner.nextDouble();
        System.out.println("\nWhat is d?"); // Prompts for user input of d and save as variable
        double d = scanner.nextDouble();
        System.out.println("\nWhat is r?"); // Prompts for user input of r and save as variable
        double r = scanner.nextDouble();
        System.out.println("\nWhat is x?"); // Prompts for user input of x and save as variable
        double x = scanner.nextDouble();
        System.out.println("\nWhat is y?"); // Prompts for user input of y and save as variable
        double y = scanner.nextDouble();
        double firstAnswer = firstFormula(r, a, b, c, d); // Calls the firstFormula method with variables r, a, b, c, and d
        double secondAnswer = secondFormula(a, b, c, x, y); // Calls the secondFormula method with variable a, b, c, x, and y
        System.out.println("\nAnswer for first formula is: " + firstAnswer + "\nAnswer for second formula is: " + secondAnswer); // Answer
    }

    // Method for the first formula
    public static double firstFormula(double a, double b, double c, double d, double r) {
        return (4 / (3 * (r + 34))) - (9 * (a + b * c)) + ((3 + d * (2 + a * a)) / (a + b * d)); // Returns answer after formula
    }

    // Method for the second formula
    public static double secondFormula(double a, double b, double c, double x, double y) {
        return ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + ((9 + x) / y)); // Returns answer after formula
    }
}
