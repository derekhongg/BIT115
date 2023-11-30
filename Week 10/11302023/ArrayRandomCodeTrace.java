import java.util.Arrays;
import java.util.Random;

// This program generates 10 random numbers between 0 and 20 for an array and
// display the numbers in reverse order
public class ArrayRandomCodeTrace {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[10];

        System.out.println("The following are the genearted random numbers: ");

        for (int i = 0; i < nums.length; i++) {

            nums[i] = rand.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(nums));

        System.out.print("The reversal of the aray is: ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

    }
}
