package vu.question5;

import java.util.Scanner;

public class InvestmentForLoop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of members: ");
            int members = scanner.nextInt();
            
            double[] principalAmounts = new double[members];
            double[] futureValues = new double[members];
            
            for (int i = 0; i < members; i++) {
                System.out.print("Enter the principal amount for member " + (i + 1) + ": ");
                principalAmounts[i] = scanner.nextDouble();
            }
            
            System.out.print("Enter the annual interest rate (in decimal, e.g., 0.05 for 5%): ");
            double rate = scanner.nextDouble();
            
            System.out.print("Enter the time period in years: ");
            int time = scanner.nextInt();
            
            for (int i = 0; i < members; i++) {
                futureValues[i] = principalAmounts[i] * Math.pow((1 + rate), time);
                System.out.println("Future value for member " + (i + 1) + ": " + futureValues[i]);
            }
        }
    }
}
