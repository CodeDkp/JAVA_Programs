/*Simple java program to impliment a simple calculator*/

import java.util.*;

class SwitchStatement_Calculator{
    public static void main(String [] s)
  {  
    int a=50,b=10;
    System.out.println("Addition press 1");
    System.out.println("Substraction press 2");
    System.out.println("Multiplication press 3");
    System.out.println("Division press 4");

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    switch(n)
    {
        case 1:
        System.out.println("Sum = "+(a+b));
                break;
        case 2: 
        System.out.println("Sub = "+(a-b));
        break;
        case 3:
        System.out.println("Mul = "+(a*b));
                break;
        case 4: 
        System.out.println("Divn = "+(a/b));
        break;   
        
        default:
        System.out.println("Invalid Choice");

    }
  }
}
/*Addition press 1
Substraction press 2
Multiplication press 3
Division press 4
1
60*/
