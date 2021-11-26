
import java.util.*;
public class NoOf_Digits {
    public static void main(String [] s)
    {
        int n,count=0;
        System.out.print("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n>0)
        {
            n/=10;
            count++;
        }
        System.out.println("Number of digits :"+count);
    }
}
/*
Enter any number: 23456
Number of digits :5
*/