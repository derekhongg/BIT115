import java.util.Scanner;

public class powerTo {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive number to use as a base: ");
    double base = input.nextDouble();

    for (int i = 1; i <= base; i++) {
      double firstPower = Math.pow(i, 1);
      double secondPower = Math.pow(i, 2);
      double thirdPower = Math.pow(i, 3);
      double fourthPower = Math.pow(i, 4);
      System.out.println(i + ":\t" + firstPower + "\t" + secondPower + "\t" + thirdPower + "\t" + fourthPower);
    }
  }
}