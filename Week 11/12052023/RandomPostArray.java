import java.util.*;

public class RandomPostArray {
	public static void main(String[] args) {
		int[] values = new int[100]; // creates new array
		int number = 0; //create counter of how many times a number shows
		Random rand = new Random(); //create random values
		System.out.println("The randomly generated values of the array are shown below");

		for (int i = 0; i < values.length; i++) { // traverses through the entire values array
			values[i] = rand.nextInt(100) + 1; // gives a random number between 1 and 100
			number++; //increment the counter for number
		}
		System.out.println(number); //prints out how many numbers are generated

		System.out.println(Arrays.toString(values)); // prints out all the values listed
		int count; // initiate count variable
		for (int i = 1; i < values.length - 1; i++) { //loops through entire value array
			count = 0; // start count at zero
			for (int j = 0; j < number; j++) //create loop through how many numbers there are
				if (values[j] == i) // if value in array is equal to to the index increment the count
					count++;
			if (count > 0) // if the number appears more than once, print statement out
				System.out.println("The value " + i + " appears " + count + " times");

		}

	}
}