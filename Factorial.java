/*Factorial of any Number*/
import java.util.Scanner;
public class Factorial {
    public static void main(String [] s)
    {
        int n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to find the Factorila: ");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.print("Factorial is: "+fact);
    }
}
/*Enter number to find the Factorila: 3
Factorial is: 6*/