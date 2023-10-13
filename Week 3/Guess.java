import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Guess {
   public static void main(String[] args) {
      Random random = new Random();
      int randomNum;
      int number = random.nextInt(100)+1;
      
      System.out.println("I'm thinking of a number between 1 and 100");
      System.out.println("Can you guess what it is?");
      
      Scanner in = new Scanner(System.in);
      randomNum = in.nextInt();
      
      System.out.println("Your guess is: " + randomNum);
      System.out.println("The number I was thinking of was: " + number);
      if(number == randomNum) {
         System.out.println("You guessed the number correctly!");
      } else {
      
         System.out.println("You were off by: " + Math.abs(number-randomNum));
      }
   }
}