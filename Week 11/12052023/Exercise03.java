import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        int[] scoreArray = new int[50]; // array to store the sales values (maximum is 50)
        Scanner input = new Scanner(System.in); // Scanner object to accept sales data from the user

        int score = 0;
        int number = -1;
        while (score != -1) {
            // Accept sales data as long as input is not a negative number
            System.out.print("Enter a new score: ");
            score = input.nextInt();
            scoreArray[++number] = score;
        }
        ;

        System.out.println("count is " + number); // print the count of scores

        double avg = 0; // find the average of all the sales
        for (int i = 0; i < number; i++) {
            avg += scoreArray[i]; // sum up all the sales one by one
        }

        avg = avg / number; // find the average

        System.out.println("Average is " + avg);

        int countAbove = 0;
        int countBelow = 0;

        // traverse through the array and find out whether each sales score
        // is greater than or equal to the average sales
        for (int i = 0; i < number; i++) {
            if (scoreArray[i] >= avg) {// if the particualar sales amount is greater or equal to average
                countAbove++;
            } else {
                countBelow++;
            }
        }

        // print the results
        System.out.println("Number of sales above or equal to the average: " + countAbove);
        System.out.println("Number of sales below the average: " + countBelow);
    }
}