/* Input a number and check it is ARMSTRONG number or not */
import java.util.Scanner;
public class Armstron_no {
    public static void main(String [] s)
    {
        int n,rem,arm=0,c;
        
        System.out.print("Enter a Number: ");

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        c=n;

        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
        System.out.println("Armstrong Number.");
        else 
        System.out.println("Not a Armstrong Number.");
    }
}
/*
Enter a Number: 153
Armstrong Number.

Enter a Number:
154
Not a Armstrong Number.
*/
