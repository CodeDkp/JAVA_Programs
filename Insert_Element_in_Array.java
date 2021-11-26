/*Inserting Element in a position in Array*/

import java.util.Scanner;
public class Insert_Element_in_Array {
    static public void main(String [] s)
    {   
        int size,loc,item,i;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        size=sc.nextInt();
        int []a=new int[size+1];

        System.out.print("Enter the Array A Elements: ");
        for(i=0;i<a.length-1;i++)
        a[i]=sc.nextInt();

        System.out.print("Enter Array Location: ");
        loc=sc.nextInt();

        System.out.print("Enter the New element: ");
        item=sc.nextInt();

        //To make space for the new Element
        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }

        a[loc]=item;
        System.out.print("New array is: ");
        for(int z:a)
        System.out.print(z+" ");
    }
}
/*
Enter Array Size: 5
Enter the Array A Elements: 1 2 3 4 5
Enter Array Location: 3
Enter the New element: 100
New array is: 1 2 3 100 4 5 
*/