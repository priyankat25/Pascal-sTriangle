package com.kodnest.pt;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        
        printPascalTriangle(rows);
        
        scanner.close();
    }

    public static void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print the values
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // Calculate the next value in the row
            }
            
            System.out.println(); // Move to the next row
        }
    }
}