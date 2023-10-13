import java.util.Scanner;

public class FahrenheitToCelcius {
   public static void main (String[] args) {
   
   Scanner in = new Scanner(System.in);
   
   System.out.print("Input a temperature in fahrenheit: ");
   double fahrenheit = in.nextDouble();
   
   double celcius = (( 5 * (farhenheit - 32.0) / 9.0));
   
   System.out.println("The temp in celcius is: " + celcius);
      
   }
}