import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
        // int age = 2,  temp = 20;
        // long viewsCount = 4_123_456_789L;

        // float price = 10.99F;
        // char letter = 'A';
        // boolean isEligible = true;


        // Date now = new Date();
        // now.getTime();
        // System.out.println(now);

        // System.out.println("Hello World");
        // System.out.println(now);


        // String name = "  John" + "!!   ";
        // System.out.println(name.replace("J", "K"));

        // System.out.println(name.toUpperCase());

        // int[] numbers = { 4, 1, 3, 2, 5 };
        // Arrays.sort(numbers);

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(numbers);


        // Two dimensional array
        // int[][] numbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };


        // System.out.println(Arrays.deepToString(numbers));

        // final is like const in javascript
        // final float pi = 3.14F;


        //arithmetic operations
        
        // double result = (double)10 / 3;
        // System.out.println(result);

        // int x  = 1;
        // // int y = ++x;

        // x += 2;

        // System.out.println("x: " + x);

        // casting

        // double x = 1.1;
        // int y = (int)x + 2;

        // System.out.println(y);


        // Math Class
        // System.out.println(Math.floor(3.14F));

        // Number Formatting
        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result = percent.format(0.1);

        // System.out.println(result);

        // Reading input

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Name:  ");
            String name = scanner.nextLine();
            System.out.println("You are " + name.trim());
        }
        
    }
}