/*Java program to Delete a Item from Array*/

import java.util.*;
public class Delete_Array_Element {
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

        // System.out.print("Enter the element to Deleate: ");
        // item=sc.nextInt();

        //To make space for the new Element
        for(i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }

        size--;
        System.out.print("New array is: ");
        for(i=0;i<size;i++)
        System.out.print(a[i]+" ");
    }
}
/*
Enter Array Size: 3
Enter the Array A Elements: 1 2 3
Enter Array Location: 1
New array is: 1 3 
*/
