//Derek Hong
//CS115
//11.09.2023
//Calculate total payment with interest with average payments

import java.util.Scanner;

class LoanPayment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("How much was the original loan?  ");
        double amount = in.nextDouble();
    
        System.out.print("How much is your interest rate on the loan (annual interest)?  ");
        double rate = in.nextDouble();
        double minimum, thisMonth;
        int count = 0;
        double totalPay = 0;

        while (amount > 0) {
            amount += (amount*rate)/1200;
            minimum = (0.05 * amount);
            System.out.printf("Current balance: $%.2f", amount);
            System.out.printf("  Minimum payment: $%.2f", minimum);
        
            System.out.println(" How much are you paying this month?");
            thisMonth = in.nextDouble();
        
            if(thisMonth < minimum) {
                System.out.printf("That is not enough, you must pay at least $%.2f", minimum);
                System.out.print(", try again ");
                thisMonth = in.nextDouble();
            }
        
            if(thisMonth > amount){
                thisMonth = amount;
                amount = 0;
            } else {
                amount -= thisMonth;
        }
        
        count++;
        totalPay += thisMonth;
        }
        double average = (double)Math.round(totalPay/count*100)/100;
        if(count > 0){
            System.out.println("Including interest, you paid $ "+((double)Math.round(totalPay*100)/100)+" over "+count+" months averaging $ "+average+" per month");
        }
    }
}