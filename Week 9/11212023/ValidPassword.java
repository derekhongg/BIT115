import java.util.Scanner;

public class ValidPassword {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		System.out.print("Enter a password: ");
		String s = input.nextLine();

		if (isValidPassword(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
	}

	/** Method isPasswordVaild tests whether a string is a valid password */
	public static boolean isValidPassword(String s) {
		int minLength = 8;	// Min Length of password
	    int minDigits = 2;	// Min digits in password

		boolean validPassword = isLengthValid(s, minLength) && isOnlyLettersAndDigits(s) && hasNDigits(s, minDigits);
		return validPassword;
	}

	// testing valid length
	public static boolean isLengthValid(String s, int validLength) {
		return s.length() >= validLength;
	}

	public static boolean isOnlyLettersAndDigits(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/** Method hasNDigits tests if a string contains at least n digits */
	public static boolean hasNDigits(String s, int n) {
		int numberOfDigits = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= n) {
				return true;
			}
		}
		return false;
	}
}