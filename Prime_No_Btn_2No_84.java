/*Java program to print all prime numbers between two Numbers.*/
import java.util.Scanner;
public class Prime_No_Btn_2No_84 {
   public static void main(String [] s)
   {
       int a,b,count=0;
       System.out.print("Enter the First Number and  Second Number: ");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();

       for(int i=a;i<=b;i++)
       {    
            count=0;
           for(int j=1;j<=i;j++)
           {
               if(i%j==0)
               count++;
           }
           if(count==2)
           System.out.println(i+" is a PRIME No");
           else 
           System.out.println(i+" is NOT a PRIME No");
       }
   } 
}
/*
Enter the First Number and  Second Number: 2 10
2 is a PRIME No
3 is a PRIME No
4 is NOT a PRIME No
5 is a PRIME No
6 is NOT a PRIME No
7 is a PRIME No
8 is NOT a PRIME No
9 is NOT a PRIME No
10 is NOT a PRIME No
*/
