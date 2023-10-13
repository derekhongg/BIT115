import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //initialize variables
        String name;
        double pricePerGallon;
        double totalPrice;
        int startOdometer;
        int endOdometer;
        
        //input for name
        System.out.print("Enter your name: ");
        name = in.next();
        
        //taking in the input for gas price
        System.out.print("Enter price per gallon: ");
        pricePerGallon = in.nextDouble();
        
        //taking in the input for the total price to fill up
        System.out.print("Enter total price to fill up: ");
        totalPrice = in.nextDouble();
        
        //getting info on the starting odometer amount
        System.out.print("Enter your initial odometer total: ");
        startOdometer = in.nextInt();
        
        //getting info on ending odometer amount
        System.out.print("Enter your ending odometer: ");
        endOdometer = in.nextInt();
        
        // get variables to setup outputs
        double gallonsUsed = (totalPrice / pricePerGallon);
        int milesDriven = endOdometer - startOdometer;

        double mpg = milesDriven / gallonsUsed;
        
        //print statement out
        System.out.println(name + ", you drove " + milesDriven + " miles using " + gallonsUsed + " gallons with an mpg of " + mpg);

    }
}