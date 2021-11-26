
import java.util.*;
public class Arrays_Class_Methods {
    public static void main(String [] s)
    {   
        //sort() method***********************************

        // int []a=new int[5];
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the Array Elements: ");
        // for(int i=0;i<a.length;i++)
        // a[i]=sc.nextInt();

        // System.out.print("Array Elements arer: ");
        // for(int z : a)
        // System.out.print(z+" ");

        // Arrays.sort(a);

        // System.out.print("\nSorted Array is: ");
        // for(int z:a)
        // System.out.print(z+" ");

        //Arrays.equals() Compares two array******************************
        // int []a=new int[5];
        // int b[]=new int[5];
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the Array A Elements: ");
        // for(int i=0;i<a.length;i++)
        // a[i]=sc.nextInt();

        // System.out.print("Enter the Array B Elements: ");
        // for(int i=0;i<a.length;i++)
        // b[i]=sc.nextInt();

        // boolean x=Arrays.equals(a,b);
        // System.out.print("Is this two Arrays are Equal: "+x);

        //copyOf() Copys array ones elements to Array 2************************************
        int []a=new int[5];
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array A Elements: ");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();

        int b[]=Arrays.copyOf(a,6);
        b[5]=100;

        System.out.print("\nArray Bs Elements are: ");
        for(int y:b)
            System.out.print(y+" ");

    }
}
/*
Arrays.sort(a)  By default it sorts the array in Ascending Order
Enter the Array Elements: 2 6 1 4 2  
Array Elements arer: 2 6 1 4 2 
Sorted Array is: 1 2 2 4 6
*/

/*Arrays.equals()
Enter the Array A Elements: 1 2 3 4 5 
Enter the Array B Elements: 1 2 3 4 5 
Is this two Arrays are Equal: true

Enter the Array A Elements: 1 2 3 4 5 
Enter the Array B Elements: 7 4 6 7 8 
Is this two Arrays are Equal: false
*/

/*
Arrays.copyOf()  Copys arrays elements
Enter the Array A Elements: 1 4 2 7 8

Array Bs Elements are: 1 4 2 7 8 
*/

/*Enter the Array A Elements: 1 2 3 4 5 6

Array Bs Elements are: 1 2 3 4 5 100 */