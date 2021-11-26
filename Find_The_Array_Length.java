/*Find the Array Elements*/

//import java.util.Scanner;
public class Find_The_Array_Length {
    static public void main(String [] s)
    {
        int []a=new int[5];
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int b : a)
        System.out.print(b+" ");

        System.out.println("\nArray Length is: "+a.length);
    }
}
/*
Enter Array Elements: 10 20 30 40 50
Array Elements are: 
10 20 30 40 50 
Array Length is: 5
*/
