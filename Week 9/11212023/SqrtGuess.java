//Derek Hong
//CS115
//11.21.2023
//Commenting what each line of the code does
import java.util.Scanner;

public class SqrtGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Starts new scanner
        System.out.print("Enter a positive value and I will approximate it square root ");
        int value = in.nextInt(); // enter the value
        while(value>0) { //start running a while loop while the value the user enters is greater than 0
            System.out.printf("%d has a square root of %.2f which I estimate to be %.2f\n", value, Math.sqrt(value), mySquareRoot(value)); //Prints out the sqare root values and the number you entered
            System.out.print("Enter a positive value and I will approximate its square root "); //Prompts you to enter it again
            
            value = in.nextInt(); // Scanner to take in the value again
        }
    }
    public static double mySquareRoot(int x) {
        double myNewGuess = 1.0, myLastGuess = 0; // sets up variables to keep running as long as values are positive
        while(Math.abs(myNewGuess-myLastGuess)>0.01){ //this loop runs while the numbers you enter in are greater than 0.01
            myLastGuess = myNewGuess; // changes the guessing number 
            myNewGuess = (myLastGuess + x / myLastGuess) / 2; // gets the square root of this number
        }
    return myNewGuess; // returns new guess
    }
}