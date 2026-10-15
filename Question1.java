// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number A: ");
        double a = s.nextDouble();

        System.out.println("Enter first number B: ");
        double b = s.nextDouble();

        System.out.println("Enter first number C: ");
        double c = s.nextDouble();

        double average = (a + b + c / 3.0);

        System.out.println("The average is: " + average);

        s.close();
    }
}
