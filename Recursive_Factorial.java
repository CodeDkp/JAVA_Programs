public class Recursive_Factorial {
    public static void main(String [] s)
    {
        Recursive_Factorial obj=new  Recursive_Factorial();
        int z=obj.factorial(3);
        System.out.println("Factorial of the Number is: "+z);
    }

    int factorial(int b)
    {
        if(b>1)
        {
            return b*factorial(b-1);
        }
        else 
        {
            return 1;
        }
    }
}
//Factorial of the Number is: 6

