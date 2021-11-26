/*Find the Biggest Element in the Array*/

import java.net.MalformedURLException;
import java.util.*;
public class Biggest_Element_in_Array {
    static public void main(String [] s)
    {
        int []a=new int[5];
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array A Elements: ");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();

        double max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print("Largest Element in the Array is: "+MalformedURLException);
    }
}
/*
Enter the Array A Elements: 5 8 2 9 11   
Largest Element in the Array is: 11.0
*/