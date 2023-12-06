import java.util.Scanner;

public class DistinctIntArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int numberOfDistinctValues = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            int value = input.nextInt();
            // Step 1: Check if value is in numbers
            boolean inArray = false;
            for(int j = 0; j < numbers.length; j++) {
                if(value == numbers[j]) {
                    inArray = true;
                }
            }
            // Step 2: If value is not in numbers, add it into numbers
            if(!inArray) {
                numberOfDistinctValues = value;
                // Step 3: Increment numberOfDistinctValues
                numberOfDistinctValues++;
                numbers[i] = value;
            }
        }
        // Step 4: Display output
        System.out.println("The number of distincts integer is " + numberOfDistinctValues);
        System.out.print("The distinct integers are [");
        for(int i = 0; i < numberOfDistinctValues;i++) {
            System.out.print(numbers[i] + "," + " ");
        }
        System.out.print("]");
    }
}
