/*Perfect Number Program*/
import java.util.Scanner;
public class Perfect_No_83 {
    public static void main(String [] s)
    {
        int n,s$um=0;
        System.out.print("Enter any Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s$um+=i;
        }
        if(s$um==n)
        System.out.println(n+" is Perfect No");
        else 
        System.out.println(n+" is not a Perfect No");
    }
}
/*
Enter any Number: 22
22 is not a Perfect No

Enter any Number: 6
6 is Perfect No
*/
