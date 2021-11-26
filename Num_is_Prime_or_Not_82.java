/*Java program to Check Entered Nhumber is Prime or not*/
import java.util.Scanner;
public class Num_is_Prime_or_Not_82 {
    public static void main(String [] s)
    {
        int n,count=0;
        System.out.print("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;

        }
        if(count==2)
        System.out.println(n+" is a PRIME No");
        else 
        System.out.println(n+" is not a PRIME No");
    }
    
}
/*
Enter a Number: 3
3 is a PRIME No

Enter a Number: 55
55 is not a PRIME No
*/