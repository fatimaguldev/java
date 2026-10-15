import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //  STRING TYPE (Reading a full sentence) ---
        System.out.print("Enter a full sentence: ");
        String sentence = s.nextLine(); // Reads the whole line including spaces


        // INTEGRAL TYPES (Whole Numbers) ---
        System.out.print("Enter a byte (-128 to 127): ");
        byte b = s.nextByte();

        System.out.print("Enter a short (-32,768 to 32,767): ");
        short sh = s.nextShort();

        System.out.print("Enter an int: ");
        int i = s.nextInt();

        System.out.print("Enter a long: ");
        long l = s.nextLong();


        //  FLOATING POINT TYPES (Decimals) ---
        System.out.print("Enter a float: ");
        float f = s.nextFloat(); 

        System.out.print("Enter a double: ");
        double d = s.nextDouble();


        //  LOGICAL & TEXTUAL TYPES ---
        System.out.print("Enter a boolean (true/false): ");
        boolean bool = s.nextBoolean();

        System.out.print("Enter a char: ");
        char ch = s.next().charAt(0); 


        //PRINTING ALL INPUTS ---
        System.out.println("\n--- Your Inputs ---");
        System.out.println("Your typed sentence is: " + sentence);
        System.out.println("byte: " + b);
        System.out.println("short: " + sh);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        
        
        System.out.println("Your typed decimal float is : " + f);
        System.out.println("Your typed decimal double is : " + d);
        
        System.out.println("boolean: " + bool);
        System.out.println("char: " + ch);

        s.close();
    }
}
