/*Sort the Array in the Ascending Order*/
import java.util.*;
public class Sorting_Array {
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
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("\nAscending Array Elements are: ");
        for(int y:a)
            System.out.print(y+" ");
    }
}
/*Enter the Array Elements: 90 30 1 5 40
Array Elements arer: 90 30 1 5 40 
Ascending Array Elements are: 1 5 30 40 90*/
