
/*Java program to implement calculator program without switch case */
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Calculator_If_else {
    public static void main(String[] s) {
        int a, b, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = sc.nextInt();
        System.out.print("Enter second nbumber: ");

        b = sc.nextInt();
        System.out.println("Coose the Operation to perform: ");
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("Sum =" + (a + b));
        } else if (n == 2)
            System.out.println("Difference=" + (a - b));
        else if (n == 3)
            System.out.println(" Multiplication = " + (a * b));
        else if (n == 4) {
            System.out.println("Division = " + (a / b));
        } else
            System.out.println("Chose between 1-4");

    }
}
/*
Enter First Number: 4
Enter second nbumber: 5
Coose the Operation to perform: 
3
 Multiplication = 20
*/