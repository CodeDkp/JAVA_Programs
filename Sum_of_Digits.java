/*Java program to find sum of digits*/
import java.util.*;
public class Sum_of_Digits
{
    public static void main(String [] args)
    {
        int n,i,sum=0;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        while(n!=0)
        {
            i=n%10;
            sum+=i;
            n/=10;
        }
        System.out.println("Sum of the digits are: "+sum);
    }
}
/*
Enter a number: 5555
Sum of the digits are: 20
*/