// Derek Hong
// 10.26.2023
// FindAndFixErrorIteration.java
// Fixing errors in the code

import java.io.*;
import java.util.Scanner; // Scanner originally not inputted

public class FindAndFixErrorIteration{
   public static void main (String[] args){
   
      Scanner keyboard = new Scanner(System.in); //needs to be System.in, not System.input
   
      System.out.println("Please enter numbers, each one followed by the enter/return key");
      System.out.println("Please type 100<enter> to exit the program"); // missing semi-colon to end the line
   
      int userNumber = 1; // anything EXCEPT 100 is good, changed number to 1
      while( userNumber != 100 ) {
         System.out.println("Please type a whole number");
         if( !keyboard.hasNextInt() ) { //needed to be NextInt() not NextInteger()
            String junkInput = keyboard.nextLine();
            System.out.println("You need to type a number.  Instead, you typed " + junkInput);
         } else { // The user DID type an integer into the keyboard
            userNumber = keyboard.nextInt(); // get int & assign to userNumber on this line, also needed to change userNumber to equal what user enters

            if( userNumber < 0 ) {
               System.out.println( userNumber + " is negative!"); //needed "+" for variable
            } else if( userNumber > 0 ) {
               System.out.println( userNumber + " is positive!");
            } else if( userNumber == 0 ) {
               System.out.println( userNumber + " is zero!");
            } 
         }
      
      System.out.println("Done!");
   }
}
} // needed one more closing bracket to close the whole program to run

