/*Sort the Array in the Descending Order*/
import java.util.*;
public class Sorting_Array_in_Descending {
    static public void main(String [] s)
    {
        int []a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Elements: ");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();

        System.out.print("Array Elements arer: ");
        for(int z : a)
        System.out.print(z+" ");

        //Sorting logic
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("\nDescending Array Elements are: ");
        for(int y:a)
            System.out.print(y+" ");
    }
}
/*
Enter the Array Elements: 6 2 8 1 4
Array Elements arer: 6 2 8 1 4 
Descending Array Elements are: 8 6 4 2 1
*/
