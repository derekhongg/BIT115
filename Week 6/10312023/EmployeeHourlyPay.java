//Derek Hong
//10.30.2023
//EmployeeHourlyPay.java
//To figure out employee hourly pay taking the factors of overtime and minimum wage

import java.util.Scanner;

public class EmployeeHourlyPay {
    public static void main(String args[]) {
        double hourlyPay = 13.69;
        int hoursWorked = 0;
        double overTime = 0.0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the hourly pay and hours worked by 4 employees");

        System.out.print("Enter the hourly rate for Employee #1: ");
        hourlyPay = in.nextDouble();

        System.out.print("Enter the hours worked by Employee #1: ");
        hoursWorked = in.nextInt();

        if ((hourlyPay < 13.69) || (hoursWorked > 60)) {
            System.out.println("Error! It is either you are paid less or you are overworked or both.");
        } else if (hoursWorked > 40 && hoursWorked < 61) {
            overTime = (1.5 * (hourlyPay)) * (hoursWorked - 40);
            System.out.println("Employee #1 gross pay: $" + ((hourlyPay * 40) + overTime));
        } else {
            System.out.println("Employee #1 gross pay: $" + (hourlyPay * hoursWorked));
        }
        ;

        System.out.print("Enter the hourly rate for Employee #2: ");
        hourlyPay = in.nextDouble();

        System.out.print("Enter the hours worked by Employee #2: ");
        hoursWorked = in.nextInt();

        if ((hourlyPay < 13.69) || (hoursWorked > 60)) {
            System.out.println("Error! It is either you are paid less or you are overworked or both.");
        } else if (hoursWorked > 40 && hoursWorked < 61) {
            overTime = (1.5 * (hourlyPay)) * (hoursWorked - 40);
            System.out.println("Employee #2 gross pay: $" + ((hourlyPay * 40) + overTime));
        } else {
            System.out.println("Employee #2 gross pay: $" + (hourlyPay * hoursWorked));
        }
        ;

        System.out.print("Enter the hourly rate for Employee #3: ");
        hourlyPay = in.nextDouble();

        System.out.print("Enter the hours worked by Employee #3: ");
        hoursWorked = in.nextInt();

        if ((hourlyPay < 13.69) || (hoursWorked > 60)) {
            System.out.println("Error! It is either you are paid less or you are overworked or both.");
        } else if (hoursWorked > 40 && hoursWorked < 61) {
            overTime = (1.5 * (hourlyPay)) * (hoursWorked - 40);
            System.out.println("Employee #3 gross pay: $" + ((hourlyPay * 40) + overTime));
        } else {
            System.out.println("Employee #3 gross pay: $" + (hourlyPay * hoursWorked));
        }
        ;

        System.out.print("Enter the hourly rate for Employee #4: ");
        hourlyPay = in.nextDouble();

        System.out.print("Enter the hours worked by Employee #4: ");
        hoursWorked = in.nextInt();

        if ((hourlyPay < 13.69) || (hoursWorked > 60)) {
            System.out.println("Error! It is either you are paid less or you are overworked or both.");
        } else if (hoursWorked > 40 && hoursWorked < 61) {
            overTime = (1.5 * (hourlyPay)) * (hoursWorked - 40);
            System.out.println("Employee #4 gross pay: $" + ((hourlyPay * 40) + overTime));
        } else {
            System.out.println("Employee #4 gross pay: $" + (hourlyPay * hoursWorked));
        }
        ;

    }
}