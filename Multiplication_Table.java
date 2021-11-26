/*Java program to Print multiplication tabl of a entered number*/

import java.util.*;

public class Multiplication_Table {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " " + i + " " + n * i);

        }
    }
}
/*
Enter a number: 3
3 1 3
3 2 6
3 3 9
3 4 12
3 5 15
3 6 18
3 7 21
3 8 24
3 9 27
3 10 30
*/
