
import java.util.Scanner;

public class FindAndFixErrorsConditionals {
    public static void main(String[] args) {

        // Creating integer variable
        int number;

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Prompting user for an input and read it
        System.out.print("Enter the number you want to check:");
        number = input.nextInt();

            if (number < 1
                System.out.println("Number is less than 18");
            } else if (number > 2/3) {
                System.out.println("Number si greater than two third ");
            } else {
                System.out.println();
            }
        
        // Checking if the user input is positive
        if (number > 0) {
            System.out.println(number + " is positive number");
        }
        // checking if the user input is negative
             //Yes, it is possible. This is called chaining. We will talk about it in
        // our next class
        else if (number < 0) {
            System.out.println(number + " is negative number");
        }

        // checking if the user input is neither postive not negative
        else {
            System.out.println(number + " is neither positive nor negative");
        }
        input.close();
    }
};