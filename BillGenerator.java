// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the cost of a pencil: ");
        float pencilCost = sc.nextFloat();
        
        System.out.print("Enter the cost of a pen: ");
        float penCost = sc.nextFloat();
        
        System.out.print("Enter the cost of an eraser: ");
        float eraserCost = sc.nextFloat();
        
        
        float totalCost = pencilCost + penCost + eraserCost;
        
        // Advanced: Adding 18% GST tax
        
        float gstAmount = totalCost * 0.18f; 
        float finalBill = totalCost + gstAmount;
        
        System.out.println("\n--- FINAL BILL ---");
        System.out.println("Subtotal: " + totalCost);
        System.out.println("GST (18%): " + gstAmount);
        System.out.println("Total Amount to Pay: " + finalBill);
        
        sc.close();
    }
}


