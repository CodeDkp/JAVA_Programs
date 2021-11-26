import java.util.Scanner;

/*Checking Leap Year*/
//Century (yr%100==0 && yr%400==0)
//(yr%100 !=0 && yr%4==0) 

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        int y;
        System.out.print("Enter any Year: ");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.print(y + " " + "Is a Leap year.");
        } else
            System.out.println(y + " " + " Is Not a Leapyear.");
    }
}
/*
Enter any Year: 2004
2004 Is a Leap year.

Enter any Year: 5000
5000  Is Not a Leapyear.
*/