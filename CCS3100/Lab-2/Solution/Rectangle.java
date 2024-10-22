public class Rectangle {
    public static void main(String[] args) {
        double width = 5.5; // Width as variable, 5.5 units
        double height = 7.6; // Height as variable, 7.6 units
        System.out.println("\nThe perimeter of the rectangle, given width = " + width + " and height = " + height + " is:\n" + perimeter(width, height) + " unit(s)"); // Answer after calling perimeter method
        System.out.println("\nThe area of the right angle likewise is:\n" + area(width, height) + " unit(s)"); // Answer after calling area method
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
