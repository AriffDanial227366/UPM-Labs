public class Rectangle {
    public static void main(String[] args) {
        final double WIDTH = 5.5; // Width as constant variable, 5.5 units
        final double HEIGHT = 7.6; // Height as constant variable, 7.6 units
        System.out.println("\nThe perimeter of the rectangle, given width = " + WIDTH + " and height = " + HEIGHT + " is:\n" + perimeter(WIDTH, HEIGHT) + " unit(s)"); // Answer after calling perimeter method
        System.out.println("\nThe area of the rectangle likewise is:\n" + area(WIDTH, HEIGHT) + " unit(s)"); // Answer after calling area method
    }

    // Method for calculating perimeter
    public static double perimeter(double width, double height) {
        return 2 * (width + height); // Returns answer
    }

    // Method for calculating area
    public static double area(double width, double height) {
        return width * height; // Returns answer
    }
}
