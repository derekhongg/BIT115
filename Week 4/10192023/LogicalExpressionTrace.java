import java.util.Scanner;

public class LogicalExpressionTrace {

	public static void main(String args[]) {

		Scanner cin = new Scanner(System.in);

		System.out.println("Enter the student number grade");
		double grade = 0.0;

		if (!cin.hasNextDouble()) {
			System.out.println("You must enter a number grade between 0 and 100");
			System.exit(1);
		}
		grade = cin.nextDouble();
		if (grade > 75 && grade <= 100) {
			System.out.println("Student's grade is A");
		}

		else if (grade > 60 && grade <= 75) {
			System.out.println("Student's grade is B");
		}

		else if (grade > 50 && grade <= 60) {
			System.out.println("Student's grade is C");
		} else if (grade > 40 && grade <= 50) {
			System.out.println("Student grade is D");
		} else if(grade < 0 || grade > 100) {
			System.out.println("Please enter a grade between 0 and 100.");
		} else {
			System.out.println("Student's grade is F");
		}
	}
}
