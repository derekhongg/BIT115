// Derek Hong
// 10.24.2023
// MovieTicket.java
// Purpose: To determine movie ticket prices depending on age & county customeris living in

import java.util.Scanner;

public class MovieTicket {
   public static void main(String args[]) {
   
      Scanner cin = new Scanner(System.in);
      
      int age;
      double price;
      char county;
      
      System.out.println("Please enter your age: ");
      age = cin.nextInt();
      
      if(age < 0) {
         System.out.println("Please enter a valid age.");
         System.exit(1);
      };
      
      System.out.println("Please enter what county you live in: ");
      county = cin.next().toLowerCase().charAt(0);
      
      
      if(county == 'k') {
         price = 30.0;
      } else {
         price = 40.0;
      };
      
      if(county == 'k' && age < 14 && age >= 5) {
         price = (30.0 * 0.82);
         price = price;
      } else if (age < 14) {
         price = 40.0 * 0.82;
      }
      
      if(county == 'k' && age >= 65) {
         price = (30.0/2);
      } else if(age >= 65) {
         price = (40.0/2);
      }
      
      if(age <= 4) {
         price = 0.0;
      }
      
      System.out.printf("Your price is: $%.2f", price);
      System.out.println();
   }
}