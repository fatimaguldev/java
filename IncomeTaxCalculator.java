import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter your income: ");
       int income = sc.nextInt();
       int tax;
       if (income < 50000) {
           System.out.println("Hurrah! 0% tax is applicable on you!");
       }
       else if (income >= 50000 && income < 1000000) {
           tax = (int) (income * 0.2);
           System.out.println("Your Tax is "+ tax);

       }
       else {
           tax = (int) (income * 0.3);
           System.out.println("Your Tax is "+ tax);
       }
       sc.close();
    }
}
