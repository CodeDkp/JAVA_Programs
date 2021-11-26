/*Program to reverse a number*/

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] s) {
        int y, i, rev = 0;
        System.out.print("Enter any multi digit Number: ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        while (y != 0) {
            i = y % 10;
            rev = rev * 10 + i;
            y /= 10;
        }
        System.out.print("Reverse of the Number is: " + rev);
    }
}
/*
Enter any multi digit Number: 12345
Reverse of the Number is: 54321

Enter any multi digit Number: 123456789
Reverse of the Number is: 987654321
*/