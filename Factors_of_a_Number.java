/*Program to finf factors of any number*/

import java.util.Scanner;

public class Factors_of_a_Number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i + " " + "is a factor of the number" + " " + n);
        }
    }
}
/*
Enter any Number: 22
1 is a factor of the number 22
2 is a factor of the number 22
11 is a factor of the number 22
22 is a factor of the number 22

Enter any Number: 41
1 is a factor of the number 41
41 is a factor of the number 41
*/
