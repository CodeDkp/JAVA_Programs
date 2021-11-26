/*Print erray elements  in reverse order*/

import java.util.Scanner;
public class Array_Reverse {
    public static void main(String [] s)
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Array Elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int b : a)
        System.out.print(b+" ");

        System.out.print("\nArray in Reverse order: ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
/*
Enter Array Elements: 10 20 30 40 50
Array Elements are: 
10 20 30 40 50 
Array in Reverse order: 50 40 30 20 10
*/