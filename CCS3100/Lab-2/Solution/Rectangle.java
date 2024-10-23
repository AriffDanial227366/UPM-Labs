public class Rectangle {
    public static void main(String[] args) {
        final double WIDTH = 5.5; // Width as constant variable, 5.5 units
        final double HEIGHT = 7.6; // Height as constant variable, 7.6 units
        double perimeter = 2 * (WIDTH + HEIGHT); // Perimeter answer
        double area = WIDTH * HEIGHT; // Area answer
        System.out.println("\nThe perimeter of the rectangle, given width = " + WIDTH + " and height = " + HEIGHT + " is:\n" + perimeter + " unit(s)"); // Answer output
        System.out.println("\nThe area of the rectangle likewise is:\n" + area + " unit(s)"); // Answer output
    }
}
