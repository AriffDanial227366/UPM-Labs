import java.util.Scanner; // Imports scanner

public class MathFormulas {
    public static void main(String[] args) {
        System.out.println("The first formula is: (4 / (3 * (r + 34))) - (9 * (a + b * c)) + ((3 + d * (2 + a * a)) / (a + b * d))\n");
        System.out.println("The second formula is: ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + ((9 + x) / y))\n");
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
        double firstAnswer = (4 / (3 * (r + 34))) - (9 * (a + b * c)) + ((3 + d * (2 + a * a)) / (a + b * d)); // Calls the firstFormula method with variables r, a, b, c, and d

        /*
        If it's hard to read, you can break the formula into steps for better readability, but it is longer:

        double stepOne = 4 / (3 * (r + 34));
        double stepTwo = 9 * (a + b * c);
        double stepThree = (3 + d * (2 + a * a) / (a + b * d)
        return stepOne - stepTwo + stepThree;

        It can be split into more steps
         */

        double secondAnswer = ((3 + 4 * x) / 5) - ((10 * (y - 5) * (a + b + c)) / x) + 9 * ((4 / x) + ((9 + x) / y)); // Calls the secondFormula method with variable a, b, c, x, and y

        /* Same thing, you can break this into steps:

        double stepOne = (3 + 4 * x) / 5;
        double stepTwo = (10 * (y - 5) * (a + b + c)) / x;
        double stepThree = 9 * ((4 / x) + ((9 + x) / y));
        return stepOne - stepTwo + stepThree;

        It can be split into more steps
        */

        System.out.println("\nAnswer for first formula is: " + firstAnswer + "\nAnswer for second formula is: " + secondAnswer); // Answer
    }
}
