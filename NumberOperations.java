package vu.question5;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            
            int product = num1 * num2 * num3;
            int sum = num1 + num2 + num3;
            int max = Math.max(num1, Math.max(num2, num3));
            
            System.out.printf("%-10s %-10s %-10s%n", "Product", "Sum", "Maximum");
            System.out.printf("%-10d %-10d %-10d%n", product, sum, max);
        }
    }
}
