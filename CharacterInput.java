/*Print character in Java*/
import java.util.Scanner;
public class CharacterInput {
    public static void main(String [] args)
    {
        char b;
        System.out.println("Enter any character: ");
        Scanner sc=new Scanner(System.in);
        b=sc.next().charAt(0);
        System.out.println(b);
    }
}
/*Enter any character: 
Deepak
D*/
