/*Smallest element in the Array*/
import java.util.*;
public class Smallest_Element_in_Array {
    static public void main(String [] s)
    {
        int []a=new int[5];
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array A Elements: ");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();

        double min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print("Smallest Element in the Array is: "+min);
    }
}
/*Enter the Array A Elements: 6 2 9 4 6
Smallest Element in the Array is: 2.0*/
