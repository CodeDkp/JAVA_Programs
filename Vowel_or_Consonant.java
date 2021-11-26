/*Checking the input is Vowerl or Consonant*/
import java.util.Scanner;
public class Vowel_or_Consonant {
    public static void main(String [] s)
    {
        char c;
        System.out.print("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        c=sc.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            System.out.println("Vowel character.");
        }
        else 
        {
            System.out.println("Consonant");
        }
    }
}
/*
Enter any character: r
Consonant

Enter any character: a
Vowel character.
*/