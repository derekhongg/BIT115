import java.util.Scanner;
import java.text.DecimalFormat;

public class MovieTicket {
   public static void main(String args[]) {
   
      Scanner cin = new Scanner(System.in);
      
      int age;
      double price;
      String county = "";
      
      System.out.println("Please enter your age: ");
      age = cin.nextInt();
      
      if(age < 0) {
         System.out.println("Please enter a valid age.");
         System.exit(1);
      };
      
      System.out.println("Please enter what county you live in: ");
      county = cin.next();
      
      
      if(county.equalsIgnoreCase("King")) {
         price = 30.0;
      } else {
         price = 40.0;
      };
      
      if(county.equalsIgnoreCase("King") && age < 14 && age >= 5) {
         price = (30.0 * 0.82)*100.00;
         price = price / 100.00;
      } else if (age < 14) {
         price = 40.0 * 0.82;
      }
      
      if(county.equalsIgnoreCase("King") && age >= 65) {
         price = (30.0/2);
      } else if(age >= 65) {
         price = (40.0/2);
      }
      
      if(age <= 4) {
         price = 0.0;
      }
      
      System.out.println("Your price is: $" + price);
   }
}