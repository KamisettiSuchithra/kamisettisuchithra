package suchithra;

import java.util.Scanner;



public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        // Find the largest odd number less than or equal to a
        int m = (n % 2 == 0) ? n - 1 : n;

        int count = 0;
        int number = 1;

        while (count < m) {
            System.out.print(number);
            if (count < m - 1) {
                System.out.print(", ");
            }
            number += 2;
            count++;
            
        }
    }
}
