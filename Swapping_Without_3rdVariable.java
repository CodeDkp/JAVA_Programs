/*Swapping of number Without using Third variable*/
import java.util.*;
class Swapping_Without_3rdVariable{
    public static void main(String [] args)
    {
        int a,b;
        System.out.print("Enter Two Number You want to Swapp: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a = "+a+" "+"b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping numbers are a = "+a+" "+"b = "+b);
    }
}
/*
Enter Two Number You want to Swapp: 100 500
a = 100 b = 500
After swapping numbers are a = 500 b = 100
*/