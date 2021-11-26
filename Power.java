/*Program to Find power of a number*/
import java.util.Scanner;
public class Power {
    public static void main(String [] args)
    {
        int i,a,b,mul=1;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        a=sc.nextInt();
        System.out.print("\nEnter the power: ");
        b=sc.nextInt();

        for(i=1;i<=b;i++)
        {
            mul*=a;
        }
        System.out.println("Power of the Number is: "+mul);
    }
}
/*
Enter a number: 6

Enter the power: 2
Power of the Number is: 36
*/