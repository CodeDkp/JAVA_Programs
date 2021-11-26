/*Java program to check given number is Palindrome or Not*/
import java.util.*;
public class program_to_check_Palindrome {
   public static void main(String [] s)
   {
       int n,n1,rev=0,j;
       System.out.print("Enter a number: ");
       Scanner sc = new Scanner(System.in);
       n=sc.nextInt();

       n1 =n;

       while(n!=0)
       {
           j=n%10;//J is called as reminder variable.
           rev=rev*10+j;
           n/=10;
       }
       if(n1 == rev)
       System.out.print("Entered number "+n1+" is a PALINDROME number.");
       else 
       System.out.println(n1+" is not a palindrome numkber");
   } 
}
/*
Enter a number: 555555
Entered number 555555 is a PALINDROME number.

Enter a number: 3456
3456 is not a palindrome numkber
*/
