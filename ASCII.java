/*prunting the ASCII value of any character*/
import java.util.Scanner;
public class ASCII {
    public static void main(String [] s)
    {
        char ch;
        System.out.print("Enter a Character: ");
        Scanner sc =new Scanner(System.in);
        ch=sc.next().charAt(0);

        int a=ch;

        System.out.println(a);
    }
}
/*
Enter a Character: a
97

Enter a Character: A
65
*/