import java.util.Scanner;

public class Quadratic {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in); // Sets up the scanner for the program

        System.out.print("Input a: "); // line asking for user in input "a"
        double a = input.nextDouble(); // user will input a double "a"
        System.out.print("Input b: "); // line asking for user in input "b"
        double b = input.nextDouble(); // user will input a double "c"
        System.out.print("Input c: "); // line asking for user in input "c"
        double c = input.nextDouble(); // user will input a double "c"

        double result = b * b - 4.0 * a * c; // set up result variable for b^2 - 4ac

        if (result > 0.0) { // if the result variable is greater than 0, r1 & r2 will run below
            /*
             * Math.sqrt() is used to calculate the square root of a value of type double
             * passed to it as argument
             * For example here: It will compute the square root of result
             */

            double r1 = (-b + Math.sqrt(result)) / (2.0 * a); // sets up addition portion of the formula
            double r2 = (-b - Math.sqrt(result)) / (2.0 * a); // sets up subtraction portion of the formula
            System.out.println("The roots are " + r1 + " and " + r2); // prints out statement of both roots
        } else if (result == 0.0) { //if result variable does equal 0, it would just run -b divided by 2a
            double r1 = -b / (2.0 * a); // sets up variable for the one root
            System.out.println("The root is " + r1); // prints out root for r1
        } else { // if result is negative, this will run
            System.out.println("The equation has no real roots."); // prints out that there are no roots
        }

    }
}