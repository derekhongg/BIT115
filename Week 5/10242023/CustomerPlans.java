// Derek Hong
// 10.24.2023
// CustomerPlans.java
// Purpose: This code determines the cost for minutes depending if you're a residential or commerical customer



import java.util.Scanner;
public class CustomerPlans{
	public static void main(String[] args){
		int minutes; // sets up the variable for minutes
		double cost = 0.0; // sets up variables for cost
		char customerType; // sets up variable fo customer type
		
		Scanner input = new Scanner(System.in); //sets up scanner for input
		
		System.out.println("Are you a residential or commercial customer? ");
		System.out.println("type res for residential or com for commercial");
		customerType = input.next().toLowerCase().charAt(0); // customer type will be the first letter of the input
		if(customerType == 'r' || customerType == 'c'){
			System.out.println("Enter the number of minutes used for the week");
			minutes = input.nextInt(); // will ask you to input the numbers of minutes used
			
			int extalMinR = minutes - 60;// gets the extra minutes for residentials
			int extralMinC = minutes - 300; // gets the extra minutes for commercials
			
			if (customerType == 'r' && minutes <= 60){ 
				cost = 5 ; // if customer type is residential and minutes is less than or equal to 60, cost is $5.00
			} else {
				cost = 5 + (0.1 * extalMinR); // else cost will be $5.00 + 10% of extra minutes used
			}
		
			if(customerType == 'c' && minutes <= 300) { 
			   cost = 300 * 0.2; // if customer type is commercial and less than 300 minutes, it will charge a flat rate of $60.00
			} else if (customerType != 'r') {
			   cost = (300 * 0.2) + (0.15 * extralMinC);	//if more than 300 minutes are used it'll charge $60.00 + 15% of extra minutes used	
			}
			
			System.out.print("Customer Type: " + customerType); // print out customer type
			System.out.print(", Total minutes used = " + minutes); // print out total minutes used
			System.out.printf(", and your total cost = $%.2f", cost ); // print out total cost up to two decimals
			//System.out.println(", and your total cost = " + cost);
			System.out.println();
	
		} else {
		   System.out.println("Error: Invalid input. Try again!!"); // if customerType doesn't equal r or c, it'll print out an error
		}
	}
}