import java.util.Scanner;

public class DistinctCharacters {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      boolean[] chars = new boolean[256]; // needs to be delcared as boolean this will declare if things are characters or not

      System.out.println("Enter the string to count the distinct characters");
      String s = input.nextLine(); // takes in inputs

      for (int i = 0; i < s.length(); ++i) { // should be zero indexed and needs to be < instead of <= // this will loop through the string
         chars[s.charAt(i)] = true; // tests if each line is a character
      }

      int count = 0; // creates a count of the characters

      for (int i = 0; i < chars.length; ++i) {
         if (chars[i]) { // sees if the char is a character
            count++; // increases count if it is distinct
         }
      }
      System.out.println("The number of unique characters in your string is: " + count);
   }
}