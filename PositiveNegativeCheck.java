// Write a Java program to get a number from the user and print whether it is
// positive or negative.

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } 
        else if (number < 0) {
            System.out.println("The number is Negative.");
        } 
        else {
            System.out.println("The number is Zero.");
        }
        
        sc.close();
    }
}

