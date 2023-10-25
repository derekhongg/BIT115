import java.util.Scanner;
public class CustomerPlans{
	public static void main(String[] args){
		int minutes;
		double cost = 0.0;
		char customerType;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Are you a residential or commercial customer? ");
		System.out.println("type res for residential or com for commercial");
		customerType = input.next().toLowerCase().charAt(0);
		if(customerType == 'r' || customerType == 'c'){
			System.out.println("Enter the number of minutes used for the week");
			minutes = input.nextInt();
			
			int extalMinR = minutes - 60;
			int extralMinC = minutes - 300;
			
			if (customerType == 'r' && minutes <= 60){
				cost = 5 ;
			} else {
				cost = 5 + (0.1 * extalMinR);
			}
		
			if(customerType == 'c' && minutes <= 300){
			   cost = 300 * 0.2;
			} else if (customerType != 'r') {
			   cost = (300 * 0.2) + (0.15 * extralMinC);		
			}
			
			System.out.print("Customer Type: " + customerType);
			System.out.print(", Total minutes used = " + minutes);
			System.out.printf(", and your total cost = $%.2f", cost );
			//System.out.println(", and your total cost = " + cost);
			System.out.println();
	
		} else {
		   System.out.println("Error: Invalid input. Try again!!");
		}
	}
}