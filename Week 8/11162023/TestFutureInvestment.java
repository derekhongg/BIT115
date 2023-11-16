public class TestFutureInvestment {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		
		System.out.print("Enter investment amount, for example 100: "); // asking you to enter the investment amount
		double investmentAmount =  input.nextDouble(); 

		System.out.print("Enter yearly interest rate, for example 5.25: "); //asking you to enter the interest rate it grows at
		double annualInterestRate = input.nextDouble();

		System.out.printf("%5s%20s\n", "Years", "Future Value"); // this line will set up the table

		for (int i = 1; i <= 30; i++) { // this part will loop through the number of years and the investment amount
			futureInvestmentValue(investmentAmount, annualInterestRate / 1200, i);
		}
	}
	public static void futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numOfYears) { // new method will take in entries by user in the main method
	   double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numOfYears * 12); // this will calculate the total value
	   System.out.printf("%5d%20.2f\n", numOfYears, futureValue); // prints out the values of years and future value
  }
}
