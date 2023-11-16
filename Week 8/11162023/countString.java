import java.util.Scanner;

public class countString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String userEntry = input.nextLine();

		// Display the number of letters in the string
		System.out.println(
			"The number of letters in the string \"" + 
			userEntry + "\": " + countLetters(userEntry));
	}

	public static int countLetters(String s) {
		int numberOfLetters = 0; // set up count for number of Letters
		for (int i = 0; i < s.length(); i++) { // loop through string
			if (Character.isLetter(s.charAt(i)))
				numberOfLetters++; // Increment the number of letters
		}
		return numberOfLetters;
	}
}